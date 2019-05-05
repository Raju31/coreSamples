package com.ju5.helper;

import java.util.ArrayList;
import java.util.List;

public class ArrayListHelper<T> {

	public List<T> removeDuplicates(List<T> il) {
		List<T> ol = null;
		boolean found = false;

		ol = new ArrayList<T>();
//checking the variables
		for (int i = 0; i < il.size(); i++) {
			found = false;
			for (int j = 0; j < ol.size(); j++) {
				if (il.get(i).equals(ol.get(j)) == true) {
					found = true;
					break;
				}
			}
			if (found == false) {
				ol.add(il.get(i));
			}
		}

		return ol;
	}

}
