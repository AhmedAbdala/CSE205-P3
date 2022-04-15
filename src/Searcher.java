/***************************************************************************************************
 * CLASS: ClassName (Searcher.java)
 *
 * DESCRIPTION
 * A description of the contents of this file.
 *
 * COURSE AND PROJECT INFORMATION
 * CSE205 Object Oriented Programming and Data Structures, Spring, 2022 - Session (B)
 *
 * Project Number: (3)
 *
 * AUTHOR: Ahmed ABDALLA, 1223819974, aabdal16@asu.edu
 ******************************************************************************************************/

import java.util.ArrayList;

public class Searcher {

    public static int search(ArrayList<Student> pList, String pKey, int pLow, int pHigh) {
        if (pLow > pHigh) {
            return -1;
        }

        int middle = (pLow + pHigh) / 2;

        int comparison = pKey.compareToIgnoreCase(pList.get(middle).getLastName());

        if (comparison == 0) {
            return middle;
        } else if (comparison < 0) {
            return search(pList, pKey, pLow, middle - 1);
        } else {
            return search(pList, pKey, middle + 1, pHigh);
        }
    }

    public static int search(ArrayList<Student> pList, String pKey) {
        return search(pList, pKey, 0, pList.size() - 1);
    }

}
