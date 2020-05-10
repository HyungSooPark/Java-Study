package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Block;
import model.UserInfo;

public class UserInfoController {
	public static void main(String[] args) {
		UserInfoController uic = new UserInfoController();
		//uic.save();
		//uic.load();
		//uic.select();
	}

	public void save(UserInfo u) {
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user= "KH";
		String password= "KH";
		
		Connection con = null;
		
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			con = DriverManager.getConnection(url,user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		PreparedStatement pstm = null;
		int res = 0;
		String sql = " INSERT INTO USERINFO VALUES(?,?,?,?) ";
		
		try {
			pstm = con.prepareStatement(sql);
			
			pstm.setString(1, u.getName());
			pstm.setString(2, u.getId());
			pstm.setString(3, u.getPw());
			pstm.setString(4, u.getPhone());
			res = pstm.executeUpdate();
			
			if(res>0)
				System.out.println("회원정보 DB 저장 성공");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				pstm.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void load() {
		//db 연결 부분
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user= "KH";
		String password= "KH";
		
		Connection con = null;
		
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			con = DriverManager.getConnection(url,user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//실행 부분
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		String sql = " SELECT NAME, ID, PW, PHONE FROM USERINFO ";
		
		try {
			
			pstm = con.prepareStatement(sql);
			rs = pstm.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString(1)+" : ["+rs.getString(2)+"/"+rs.getString(3)+"/"+rs.getString(4)+"]");				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstm.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	
	}
	
	public void select() {
		//db 연결 부분
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user= "KH";
		String password= "KH";
		
		Connection con = null;
		
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			con = DriverManager.getConnection(url,user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//실행 부분
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		String sql = " DELETE FROM USERINFO WHER ID=? ";
		
		try {
			
			pstm = con.prepareStatement(sql);
			
			pstm.setString(1, "zxc");
			
			rs = pstm.executeQuery();
			
			while(rs.next()) {
				//System.out.println(rs.getString(1)+" : ["+rs.getString(2)+"/"+rs.getString(3)+"/"+rs.getString(4)+"]");
				System.out.println(rs.getString(1)+"");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				//rs.close();
				pstm.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	
	}
	
	public ArrayList<UserInfo> getUserInfoList() {
		ArrayList<UserInfo> arr = new ArrayList<UserInfo>();
		//ArrayList<String> idpwlist = new ArrayList<String>();
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user= "KH";
		String password= "KH";
		
		Connection con = null;
		
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			con = DriverManager.getConnection(url,user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//실행 부분
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		String sql = " SELECT NAME, ID, PW, PHONE FROM USERINFO ";
		
		try {
			
			pstm = con.prepareStatement(sql);
			rs = pstm.executeQuery();
			
			while(rs.next()) {
				//System.out.println(rs.getString(1));
				UserInfo u = new UserInfo(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
				arr.add(u);
				//idpwlist.add(rs.getString(2)+"/"+rs.getString(3));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstm.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		/*UserInfo[] UserInfo_list = (UserInfo[]) arr.toArray(new UserInfo[arr.size()]);
		
		String[] list = new String[UserInfo_list.length];
		
		for(int i=0;i<list.length;i++) {
			list[i] = UserInfo_list[i].getIDPW();
		}*/
		
		
		return arr;
	}
}
