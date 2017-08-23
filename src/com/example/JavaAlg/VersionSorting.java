package com.example.JavaAlg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class VersionSorting {

	public static void main(String[] args) {

		List<String> versionList = new ArrayList<>();
		versionList.add("2.3.4_release");
		versionList.add("1.3.4_snap");
		versionList.add("1.3.1_release");
		versionList.add("4.3.4_snap");
		versionList.add("1.3.5_grunt");
		versionList.add("2.2.2_snap");
		List<Version> versionListObj = new ArrayList<Version>();
		System.out.println("List");
		for (String str : versionList) {
			Version v = new Version();
			String[] nameSplit = str.split("_");
			v.setName(nameSplit[1]);
			String[] versionStr = nameSplit[0].split("\\.");
			v.setParentVersion(Integer.parseInt(versionStr[0]));
			v.setMainVersion(Integer.parseInt(versionStr[1]));
			v.setChildVersion(Integer.parseInt(versionStr[2]));

			versionListObj.add(v);
		}
		Collections.sort(versionListObj, new VersionComparator());

		for (Version version : versionListObj) {
			System.out.println(" Sorted Version Details " + version.getParentVersion() + "." + version.getMainVersion()
					+ "." + version.getChildVersion() + "_" + version.getName());
		}

		Set<String> treeSet = new TreeSet<String>();
		treeSet.add("2.3.4_release");
		treeSet.add("1.3.4_snap");
		treeSet.add("3.3.4_release");
		treeSet.add("4.3.4_snap");

		System.out.println("Tree");
		for (String str : treeSet) {
			System.out.println(str);
		}

	}

}

/*
 * implements Comparator<String> {
 * 
 * @Override public int compare(String str1, String str2) { if(str1!=null &&
 * str2!=null){ int length = str1.length() > str2.length() ?
 * str1.length():str2.length();
 * 
 * } return 0; }
 * 
 */