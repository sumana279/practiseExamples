package com.example.JavaAlg;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.zip.GZIPInputStream;

public class getBLOB {
	// static String shard1Url =
	// "jdbc:oracle:thin:@//dal-us-scan-pr40.prod.walmart.com:61290/uss1xap1_ro.gecwalmart.com";
	static String shard2Url = "jdbc:oracle:thin:@//dal-us-scan-pr36.prod.walmart.com:61290/uss2xap1_ro.gecwalmart.com";
	static String username = "checkout5_readonly";
	static String password = "checkout5_readonly_p";

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// Connection shard1conn = DriverManager.getConnection(shard1Url,
		// username, password);
		Connection shard2conn = DriverManager.getConnection(shard2Url, username, password);
		String sql = "select Z_ful_option_details  from pc_line_item where purchase_contract_id = hextoraw('16ED16BDED1F4AE781BD4047E4A5F3EF')";
		PreparedStatement stmt = shard2conn.prepareStatement(sql);
		ResultSet resultSet = stmt.executeQuery();
		while (resultSet.next()) {
			byte[] in = resultSet.getBytes(1);
			ByteArrayInputStream bais = new ByteArrayInputStream(in);
			GZIPInputStream gzipIn = new GZIPInputStream(bais);
			ObjectInputStream objectIn = new ObjectInputStream(gzipIn);
			String jsonStr = (String) objectIn.readObject();
			System.out.println(jsonStr);
		}
		// shard1conn.close();
		shard2conn.close();
	}
}