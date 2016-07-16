/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sreekrishnacaters;

import db.Dbcon;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kakes
 */
public class SreeKrishnaCaters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // boolean loggedIn = true;
        Dbcon dbcon=new Dbcon();
       
        ResultSet rs= dbcon.select("select * from tbl_admin");
        try {
            if(rs.next()){
                if(rs.getString(4).equals("true")) {
                    Dashboard dashboard=new Dashboard();
                    dashboard.setVisible(true);
                    
                } else {
                    Login login = new Login();
                    login.setVisible(true);
                }
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(SreeKrishnaCaters.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
