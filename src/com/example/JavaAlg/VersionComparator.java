package com.example.JavaAlg;

import java.util.Comparator;

public class VersionComparator implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		Version v1 = (Version) o1;
		Version v2 = (Version) o2;

		// System.out.println(" V1 --> Name " + v1.getName() + " Version
		// Details" + v1.getParentVersion() + "."
		// + v1.getMainVersion() + "." + v1.getChildVersion());
		// System.out.println(" V2 --> Name " + v2.getName() + " Version
		// Details" + v2.getParentVersion() + "."
		// + v2.getMainVersion() + "." + v2.getChildVersion());
      
		
		
		if (v1.getName().compareTo(v2.getName()) > 0) {
			return -1;
		} else if (v1.getParentVersion() > v2.getParentVersion()) {
			return 1;
		} else if (v1.getParentVersion() == v2.getParentVersion()) {
			if (v1.getMainVersion() > v2.getMainVersion()) {
				return 1;
			} else if (v1.getMainVersion() < v2.getMainVersion()) {
				return -1;
			} else if (v1.getMainVersion() == v2.getMainVersion()) {
				if (v1.getChildVersion() > v2.getChildVersion()) {
					return 1;
				} else if (v1.getChildVersion() < v2.getChildVersion()) {
					return -1;
				} else {
					return 0;
				}
			}
		} else if (v1.getParentVersion() < v2.getParentVersion()) {
			return -1;
		}

		return 0;
	}

}
