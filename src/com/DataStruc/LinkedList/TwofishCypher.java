package com.DataStruc.LinkedList;

import Twofish.*;
import java.security.InvalidKeyException;

public class TwofishCypher {
	// private static final Logger logger =
	// Logger.getLogger(TwofishCypher.class.getName());
	private static final String KEY = "q(74Khd^30*5%21*dk*CiE38^re_0Qh1";
	private static final int BLOCK_SIZE = 16;

	public static String encrypt(String in) {

		return encrypt(in, KEY);
	}

	public static String encrypt(String in, String keyText) {

		Object key = null;

		try {
			key = Twofish_Algorithm.makeKey(keyText.getBytes());
		} catch (InvalidKeyException e) {
			e.toString();
		}

		int padded_length = 0;

		if ((in.length() % 16) == 0) {
			padded_length = in.length();
		} else {
			padded_length = in.length() + (BLOCK_SIZE - (in.length() % 16));
		}

		byte[] b = new byte[padded_length];
		System.arraycopy(in.getBytes(), 0, b, 0, in.length());

		byte[] out = new byte[padded_length];

		for (int i = 0; i < padded_length; i += BLOCK_SIZE) {
			System.arraycopy(Twofish_Algorithm.blockEncrypt(b, i, key), 0, out, i, BLOCK_SIZE);
		}

		return bytesToHexString(out);
	}

	public static String bytesToHexString(byte[] in) {

		return (bytesToHexString(in, 0, in.length));
	}

	public static String bytesToHexString(byte[] in, int index, int length) {

		StringBuffer sb = new StringBuffer();

		for (int i = index; i < (index + length); ++i) {
			int val = (int) in[i] + 128; /* make it unsigned */

			if (val <= 15) {
				sb.append("0" + Integer.toHexString(val));
			} else {
				sb.append(Integer.toHexString(val));
			}
		}

		return (sb.toString());
	}

	public static String decrypt(String in) {

		return decrypt(in, KEY);
	}

	public static byte[] hexStringToBytes(String in) {
		// Assert.pre(in != null);

		int len = in.length();
		byte[] out = new byte[len / 2];
		int i;
		int y;

		for (i = 0, y = 0; i < len; i += 2, ++y) {
			out[y] = (byte) (Integer.parseInt(in.substring(i, i + 2), 16)
					- 128); /* byte into signed byte */
		}

		// Assert.post(out != null);

		return (out);
	}

	public static String decrypt(String in, String keyText) {

		Object key = null;

		try {
			key = Twofish_Algorithm.makeKey(keyText.getBytes());
		} catch (InvalidKeyException e) {
			e.toString();
		}

		byte[] b = hexStringToBytes(in);
		byte[] out = new byte[b.length];

		for (int i = 0; i < b.length; i += BLOCK_SIZE) {
			System.arraycopy(Twofish_Algorithm.blockDecrypt(b, i, key), 0, out, i, BLOCK_SIZE);
		}

		return (new String(getAsciiBytes(new String(out)))).trim();
	}

	public static byte[] getAsciiBytes(String s) {
		try {
			return s.getBytes("US-ASCII");
		} catch (Exception e) {
			// This can be a null pointer or an unsupported encoding exception
			return null;
		}
	}

	public static void main(String[] args) {
		String ctext = decrypt(
				"78a686f2891570fe5620c645a67614c8ba275bdd131b0d7a52bf670e01a05db6537d4ad7ad090632912b26ffcff55c3f53f96550331c51866aab0306b9b5a8dd851d04b3e5b1043b6b2d5911d714ca47086d321dd33abb285dc8b6a1f65daac45d220f788d508224ee2331e474002b9819847043caf8aef46b90ac55efb962c3b09ac7931805daec108d38014028e975b57ffdac187353b2525c14aff5a945ffd1aced911df6debf7c8f147a0341ede54608c341f0c8fc37db5d8c3f29065b90cb50ac241bd5838305a705877acb4bb518094ac9c910e17790f31ee3575facf82f82a3b70d4f3a76016eaf3050de97ddcac15edf3124f3e884b3b564a76a4808");
		System.out.println(ctext);
	}
}
