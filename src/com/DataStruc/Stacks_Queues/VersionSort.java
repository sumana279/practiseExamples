package com.DataStruc.Stacks_Queues;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VersionSort implements Comparable<VersionSort> {

	private String jName;
	private int jVersion;
	private int jSubVersion;
	static int GREATER = 1;
	static int LESSER = -1;
	static int EQUAL = 0;

	public VersionSort(String jName, int jVersion, int jSubVersion) {
		super();
		this.jName = jName;
		this.jVersion = jVersion;
		this.jSubVersion = jSubVersion;
	}

	public String getjName() {
		return jName;
	}

	public void setjName(String jName) {
		this.jName = jName;
	}

	public int getjVersion() {
		return jVersion;
	}

	public void setjVersion(int jVersion) {
		this.jVersion = jVersion;
	}

	public int getjSubVersion() {
		return jSubVersion;
	}

	public void setjSubVersion(int jSubVersion) {
		this.jSubVersion = jSubVersion;
	}

	@Override
	public int compareTo(VersionSort vs) {
		// TODO Auto-generated method stub
		if (this == vs)
			return EQUAL;
		if (EQUAL == this.jName.compareTo(vs.getjName())) {
			if (this.jVersion == vs.getjVersion()) {

				if (this.jSubVersion == vs.getjSubVersion()) {
					return EQUAL;
				} else if (this.jSubVersion > vs.getjSubVersion()) {
					return GREATER;
				} else if (this.jSubVersion < vs.getjSubVersion()) {
					return LESSER;
				}
			} else if (this.jVersion > vs.getjVersion()) {
				return GREATER;
			} else if (this.jSubVersion < vs.jSubVersion) {
				return LESSER;
			}
		}
		return this.jName.compareTo(vs.getjName());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((jName == null) ? 0 : jName.hashCode());
		result = prime * result + jSubVersion;
		result = prime * result + jVersion;
		return result;
	}


	@Override
	public String toString() {
		return "VersionSort [jName=" + jName + ", jVersion=" + jVersion + ", jSubVersion=" + jSubVersion + "]";
	}

	public static void main(String[] args) {

		List<String> versionList = new ArrayList<String>();
		List<VersionSort> vList = new ArrayList<VersionSort>();
		String vPattern = "(\\d+).(\\d+)_(\\w+)";
		Pattern r = Pattern.compile(vPattern);
		versionList.add("2.3_release");
		versionList.add("1.3_snap");
		versionList.add("3.3_release");
		versionList.add("4.3_snap");
		versionList.add("1.2_grunt");
		for (String a : versionList) {
			// System.out.println(a);
			Matcher m = r.matcher(a);
			if (m.find()) {
				// System.out.println("Found value: " + m.group(1) +" "+
				// m.group(2)+" "+m.group(3));
				VersionSort vsObj = new VersionSort(m.group(3), new Integer(m.group(1)).intValue(),
						new Integer(m.group(2)).intValue());
				vList.add(vsObj);
			}
		}

		Collections.sort(vList);
		for (VersionSort a : vList) {
			System.out.println("Found value: " + a.toString());
		}
	}

}