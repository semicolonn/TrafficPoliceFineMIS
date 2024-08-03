package trafficpolicefinemis;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.ComboBox;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class function {

    static Connection con;

    public function() {
        con = (Connection) databaseDetails.conDB();
    }
    //databaseDetails dbdetails = new databaseDetails();
    protected boolean flag_ = false;
    String dir = "C:/Users/DE LL/Documents/NetBeansProjects/TrafficPoliceFineMIS/src/usersProfilePhoto/";

    protected void loadVehicleDetails(
            String session, JLabel vehType, JLabel color, JLabel year, JLabel regNr,
            JLabel vin, JLabel engNr, JLabel provinceName) {
        try {
            String query = "SELECT * FROM vehicles_view_table WHERE regNr='" + session + "'";

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(query);

            if (rs.next()) {
                vehType.setText(rs.getString("vehType"));
                color.setText(rs.getString("color"));
                year.setText(rs.getString("year"));
                regNr.setText(String.valueOf(rs.getInt("regNr")));
                vin.setText(rs.getString("vin"));
                engNr.setText(rs.getString("engNr"));
                provinceName.setText(rs.getString("provinceName"));

                // con.close();
                flag_ = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(function.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//end of the function

    //loadfinetype to combobox
    protected void loadFineAmountCombobox(JComboBox c) {
        try {

            String query = "SELECT * FROM fineamount";

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                c.addItem(rs.getDouble("amount"));
            }
            //con.close();

        } catch (SQLException ex) {
            Logger.getLogger(function.class.getName()).log(Level.SEVERE, null, ex);
        }

    } //end of the function

    //get current date and time
    protected void currentDateTime(JLabel l) {

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        l.setText((dateFormat.format(date))); //2016/11/16 12:08:43

    }// end of the function

    //execute the fine
    protected void executeFine(
            String plateNr,
            String date_,
            String vehicleType,
            String color,
            int makeYear,
            String vin,
            String engineNr,
            String province,
            String plateNo,
            String fineType,
            String fineAmount,
            JFrame f
    ) {

        try {

            //get the make year id from the table
            String queryGetVehType = "SELECT id FROM makeyear WHERE year="
                    + "'" + makeYear + "'";

            Statement st_MakeYear = con.createStatement();

            ResultSet rs_makeYear = st_MakeYear.executeQuery(queryGetVehType);

            int vehMakeYearId = 0;

            while (rs_makeYear.next()) {
                vehMakeYearId = rs_makeYear.getInt("id");
            }

            //get vehicle type id  from the table
            String qGetVehType = "SELECT id FROM vehicletype WHERE vehType="
                    + "'" + vehicleType + "'";

            Statement st_veh_type = con.createStatement();

            ResultSet rs_veh_type = st_veh_type.executeQuery(qGetVehType);

            int vehTypeId = 0;

            while (rs_veh_type.next()) {
                vehTypeId = rs_veh_type.getInt("id");
            }

            //get the province id from the table
            String queryGetIDPrv = "SELECT * FROM province WHERE provinceName="
                    + "'" + province + "'";

            Statement stPrv = con.createStatement();

            ResultSet rsPrv = stPrv.executeQuery(queryGetIDPrv);

            int province_id = 0;

            while (rsPrv.next()) {
                province_id = rsPrv.getInt("id");
            }

            //get the fine type id from the table     
            String queryGetFTypeId = "SELECT id FROM fine_type WHERE type="
                    + "'" + fineType + "'";

            Statement stFineType = con.createStatement();

            ResultSet rsFineType = stFineType.executeQuery(queryGetFTypeId);

            int fineTypeId = 0;

            while (rsFineType.next()) {
                fineTypeId = rsFineType.getInt("id");
            }

            //get the fine amount id from the table     
            String queryGetFAmountId = "SELECT id FROM fineamount WHERE amount="
                    + "'" + fineAmount + "'";

            Statement stAmount = con.createStatement();

            ResultSet rsAmount = stAmount.executeQuery(queryGetFAmountId);

            int fineamntID = 0;

            while (rsAmount.next()) {
                fineamntID = rsAmount.getInt("id");
            }
            //search for the plate nr to execute the fine over
            String query = "SELECT * FROM vehiclesdetails WHERE regNr='"
                    + plateNr + "'";

            Statement st_plateNr = con.createStatement();

            ResultSet rs_plateNr = st_plateNr.executeQuery(query);
            //get the vehicle plate nr id from the vehicledetails table
            if (rs_plateNr.next()) {
                String q_insert = "INSERT INTO `fine_execution`"
                        + "(`id`, `date_`, `vehicleType_id_fk`,"
                        + " `color`, `makeyear_id_fk`, `vin`, `engine`,"
                        + " `province_id_fk`, `plate_nr`, `fine_amount_id_fk`, "
                        + "`fine_type_id_fk`) VALUES (null,?,?,?,?,?,?,?,?,?,?)";

                PreparedStatement pst = con.prepareStatement(q_insert);
                pst.setString(1, date_);
                pst.setInt(2, vehTypeId);
                pst.setString(3, color);
                pst.setInt(4, vehMakeYearId);
                pst.setString(5, vin);
                pst.setString(6, engineNr);
                pst.setInt(7, province_id);
                pst.setString(8, plateNr);
                pst.setInt(9, fineTypeId);
                pst.setInt(10, fineamntID);
                pst.execute();

                JOptionPane.showMessageDialog(f, "جریمه موافقانه اجرا شد!");
            }

            //con.close();
            flag_ = true;

        } catch (SQLException ex) {
            //Logger.getLogger(function.class.getName()).log(Level.SEVERE, null, ex);

            JOptionPane.showMessageDialog(f, "در سیستم مشکل وجود دارد!");
            System.err.println("function.java: " + ex.getMessage());
        }
    }// end of the function

    //load the status of the payment
    protected void loadFineType(JComboBox c) {
        try {

            String query = "SELECT * FROM fine_type";

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                c.addItem(rs.getString("type"));
            }
            //con.close();

        } catch (SQLException ex) {
            Logger.getLogger(function.class.getName()).log(Level.SEVERE, null, ex);
        }
    }// end of the function

    //load the status of the payment
    protected void insertFinePaymentRecord(
            int fined_vehId,
            String date_,
            String vehType,
            String color,
            String vin,
            String regNr,
            String driverName,
            double fineAmount,
            String fineType,
            JFrame f
    ) {

        try {
            //get vehicle type id  from the table
            String queryGetVehType = "SELECT id FROM vehicletype WHERE vehType="
                    + "'" + vehType + "'";

            Statement st_veh_type = con.createStatement();

            ResultSet rs_veh_type = st_veh_type.executeQuery(queryGetVehType);

            int vehTypeId = 0;

            while (rs_veh_type.next()) {
                vehTypeId = rs_veh_type.getInt("id");
            }
            //get the fine amount id from the table     
            String queryGetFAmountId = "SELECT id FROM fineamount WHERE amount="
                    + "'" + fineAmount + "'";

            Statement stAmount = con.createStatement();

            ResultSet rsAmount = stAmount.executeQuery(queryGetFAmountId);

            int fineamntID = 0;

            while (rsAmount.next()) {
                fineamntID = rsAmount.getInt("id");
            }
            //get the fine amount id from the table     
            String qry_get_FineType = "SELECT id FROM fine_type WHERE type="
                    + "'" + fineType + "'";

            Statement stFineType = con.createStatement();

            ResultSet rsFineType = stFineType.executeQuery(qry_get_FineType);

            int fineTypeId = 0;

            while (rsFineType.next()) {
                fineTypeId = rsFineType.getInt("id");
            }
            String q_insert = "INSERT INTO `finepayments`"
                    + "(`id`, `fined_veh_id`, `date_`, `vehicle_type_id_fk`,"
                    + " `color`, `vin`, `regNr`, `driver_name`,"
                    + " `fine_amount_id_fk`, `fine_type_id_fk`) "
                    + "VALUES (null,?,?,?,?,?,?,?,?,?)";

            PreparedStatement pst = con.prepareStatement(q_insert);
            pst.setInt(1, fined_vehId);
            pst.setString(2, date_);
            pst.setInt(3, vehTypeId);
            pst.setString(4, color);
            pst.setString(5, vin);
            pst.setString(6, regNr);
            pst.setString(7, driverName);
            pst.setDouble(8, fineamntID);
            pst.setInt(9, fineTypeId);
            pst.execute();

            String deleteQuery = "DELETE FROM `fine_execution` WHERE "
                    + "id='" + fined_vehId + "'";
            PreparedStatement Del_pst = con.prepareStatement(deleteQuery);
            Del_pst.executeUpdate();
            fine_view_table fvt = new fine_view_table();
            loadDataToTable(fvt.vehiclesDetailsTable);
            loadDataToTable_PAIDFINES(fvt.jTable_paid_fines);
            //con.close();
            flag_ = true;

            JOptionPane.showMessageDialog(f, "جریمه واسطه موافقانه پرداخت شد!");
        } catch (SQLException ex) {
            Logger.getLogger(function.class.getName()).log(Level.SEVERE, null, ex);
        }

    }// end of the function

    //load data to the table to show all the fines of the vehicles
    protected void loadDataToTable(JTable vehiclesDetailsTable) {

        try {
            String query = "SELECT * FROM view_vehiclesfine";

            Statement st;

            st = con.createStatement();

            ResultSet rs = st.executeQuery(query);

            DefaultTableModel dm = (DefaultTableModel) vehiclesDetailsTable.getModel();
            while (rs.next()) {

                Object obj[] = {
                    rs.getInt("id"),
                    rs.getString("date_"),
                    rs.getString("vehType"),
                    rs.getString("color"),
                    rs.getInt("year"),
                    rs.getString("vin"),
                    rs.getString("engine"),
                    rs.getString("provinceName"),
                    rs.getString("plate_nr"),
                    rs.getDouble("amount"),
                    rs.getString("fine_type"),};
                dm.addRow(obj);

            }

            //con.close();
        } catch (SQLException ex) {
            Logger.getLogger(function.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//end of the function

    //load the data to jtable for the paid fines of the vehicles
    protected void loadDataToTable_PAIDFINES(JTable paidFinesTable) {

        try {

            String query = "SELECT * FROM view_paid_fines";

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(query);

            DefaultTableModel dm = (DefaultTableModel) paidFinesTable.getModel();
            while (rs.next()) {

                Object obj[] = {
                    rs.getInt("fined_veh_id"),
                    rs.getString("date_"),
                    rs.getString("vehType"),
                    rs.getString("color"),
                    rs.getString("vin"),
                    rs.getInt("regNr"),
                    rs.getString("driver_name"),
                    rs.getString("amount"),
                    rs.getString("type")
                };
                dm.addRow(obj);

            }

            //con.close();
        } catch (SQLException ex) {
            Logger.getLogger(fine_view_table.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//end of the function

    //load user types into combo box
    protected void load_usertype(JComboBox c) {

        try {
            String query = "SELECT user FROM usertype";

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                c.addItem(rs.getString("user"));
            }
            //con.close();

        } catch (SQLException ex) {
            Logger.getLogger(function.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//end of the function


    //load the vehicle type
    protected void loadVehicleType(JComboBox c) {

        try {
            String query = "SELECT * FROM vehicletype";

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                c.addItem(rs.getString("vehType"));
            }
            //con.close();

        } catch (SQLException ex) {
            Logger.getLogger(function.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//end of the function

    //load the vehicle make year model
    protected void loadVehicleMakeYear(JComboBox c) {

        try {
            String query = "SELECT * FROM makeyear";

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                c.addItem(rs.getString("year"));
            }
            //con.close();

        } catch (SQLException ex) {
            Logger.getLogger(function.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//end of the function

    //load the provinces
    //load the vehicle make year model
    protected void loadProvince(JComboBox c) {

        try {
            String query = "SELECT * FROM province";

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                c.addItem(rs.getString("provinceName"));
            }
            //con.close();

        } catch (SQLException ex) {
            Logger.getLogger(function.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//end of the function

    //load the country make
    protected void loadCountryMake(JComboBox c) {

        try {
            String query = "SELECT * FROM make_country";

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                c.addItem(rs.getString("country_name"));
            }
            //con.close();

        } catch (SQLException ex) {
            Logger.getLogger(function.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//end of the function

    //load the vehicle brand
    //load the country make
    protected void loadVehicleBrand(JComboBox c) {

        try {
            String query = "SELECT * FROM vehicle_brand";

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                c.addItem(rs.getString("brand_name"));
            }
            //con.close();

        } catch (SQLException ex) {
            Logger.getLogger(function.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//end of the function

    //Register vehicles
    protected void insertVehiclesDetails(
            String vehicleType,
            String vehicleMakeYear,
            String vehiclePlate,
            String vin,
            String engNr,
            String color,
            String province,
            String ownerName,
            String countryMake,
            String vehicleBrand,
            JFrame f
    ) {

        if (vehicleType.equals("") || vehicleMakeYear.equals("")
                || vehiclePlate.equals("") || vin.equals("")
                || engNr.equals("") || color.equals("") || ownerName.equals("")) {
            JOptionPane.showMessageDialog(f, "لطفن تمام فیلد ها را پر کنید!");
            return;
        }

        try {

            try {
                //CHECK THE DUPLICATE PLATE NUMBERS
                String checkQuery = "SELECT * FROM vehiclesdetails WHERE regNr="
                        + "'" + vehiclePlate + "'";

                Statement stCheck;

                stCheck = con.createStatement();

                ResultSet rsCheck = stCheck.executeQuery(checkQuery);

                if (rsCheck.next()) {

                    JOptionPane.showMessageDialog(f, "پلیت نمبر در سیستم وجود دارد!");
                    return;
                }
            } catch (SQLException ex) {
                Logger.getLogger(registerVehicle.class.getName()).log(Level.SEVERE, null, ex);
            }

            //get vehicle type id from table
            String queryOne = "SELECT * FROM vehicletype WHERE vehType="
                    + "'" + vehicleType + "'";

            Statement stOne = con.createStatement();

            ResultSet rsOne = stOne.executeQuery(queryOne);

            int vehicleType_id = 0;

            while (rsOne.next()) {
                vehicleType_id = rsOne.getInt("id");
            }

            //get the make year from the table
            String queryTwo = "SELECT * FROM makeyear WHERE year="
                    + "'" + vehicleMakeYear + "'";

            Statement stTwo = con.createStatement();

            ResultSet rsTwo = stTwo.executeQuery(queryTwo);

            int vehicleMakeYear_id = 0;

            while (rsTwo.next()) {
                vehicleMakeYear_id = rsTwo.getInt("id");
            }

            //get the provinces id     
            String queryThree = "SELECT * FROM province WHERE provinceName="
                    + "'" + province + "'";

            Statement stThree = con.createStatement();

            ResultSet rsThree = stThree.executeQuery(queryThree);

            int province_id = 0;

            while (rsThree.next()) {
                province_id = rsThree.getInt("id");
            }

            //get the country make id
            String queryFour = "SELECT * FROM make_country WHERE country_name="
                    + "'" + countryMake + "'";

            Statement stFour = con.createStatement();

            ResultSet rsFour = stFour.executeQuery(queryFour);

            int country_id = 0;

            while (rsFour.next()) {
                country_id = rsFour.getInt("id");
            }

            //get the vehicle brand id
            String queryFive = "SELECT * FROM vehicle_brand WHERE brand_name="
                    + "'" + vehicleBrand + "'";

            Statement stFive = con.createStatement();

            ResultSet rsFive = stFive.executeQuery(queryFive);

            int brand_id = 0;

            while (rsFive.next()) {
                brand_id = rsFive.getInt("id");
            }

            String query_Insert_vehDetails = "INSERT INTO `vehiclesdetails`"
                    + "(`id`, `veh_type_id_fk`, `make_id_fk`, `regNr`, `vin`, "
                    + "`engNr`, `color`, `prv_id_fk`, `owner`, `country_made_id_fk`, "
                    + "`veh_brand_id_fk`) VALUES (null,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(query_Insert_vehDetails);
            pst.setInt(1, vehicleType_id);
            pst.setInt(2, vehicleMakeYear_id);
            pst.setString(3, vehiclePlate);
            pst.setString(4, vin);
            pst.setString(5, engNr);
            pst.setString(6, color);
            pst.setInt(7, province_id);
            pst.setString(8, ownerName);
            pst.setInt(9, country_id);
            pst.setInt(10, brand_id);
            pst.execute();

            //con.close();
            JOptionPane.showMessageDialog(f, "مشخصات موافقانه اضافه گردید!");

        } catch (SQLException ex) {
            Logger.getLogger(function.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//end of the function

    //load the registered vehicles details in data table
    protected void loadRegVehiclesDetails(JTable t) {

        try {

            String query = "SELECT * FROM vehicles_view_table";

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(query);

            DefaultTableModel dm = (DefaultTableModel) t.getModel();
            while (rs.next()) {

                Object obj[] = {
                    rs.getInt("id"),
                    rs.getString("vehType"),
                    rs.getString("year"),
                    rs.getString("regNr"),
                    rs.getString("vin"),
                    rs.getString("engNr"),
                    rs.getString("color"),
                    rs.getString("provinceName"),
                    rs.getString("owner"),
                    rs.getString("country_name"),
                    rs.getString("brand_name"),};
                dm.addRow(obj);

            }

            //con.close();
        } catch (SQLException ex) {
            Logger.getLogger(fine_view_table.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//end of the function

//test function here ############D  E   L   E   T   E####################
//############################END OF THE PAGE############################
}
