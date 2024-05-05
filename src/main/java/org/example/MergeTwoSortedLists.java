package org.example;

import org.example.data_structure.ListNode;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list3, head;

        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        if (list1.getVal() <= list2.getVal()) {
            head = new ListNode(list1.getVal());
            list1 = list1.getNext();
        } else  {
            head = new ListNode(list2.getVal());
            list2 = list2.getNext();
        }

        list3 = head;

        while (list1 != null && list2 != null) {
            if (list1.getVal() <= list2.getVal()) {
                list3 = addToList(list3, list1.getVal());
                list1 = list1.getNext();
            } else {
                list3 = addToList(list3, list2.getVal());
                list2 = list2.getNext();
            }
        }

        while (list1 == null && list2 != null) {
            list3 = addToList(list3, list2.getVal());
            list2 = list2.getNext();
        }

        while (list1 != null) {
            list3 = addToList(list3, list1.getVal());
            list1 = list1.getNext();
        }

        return head;
    }

    public ListNode addToList(ListNode list, int addValue) {
        ListNode newNode = new ListNode(addValue);
        if (list != null) {
            list.setNext(newNode);
        }
        return newNode;
    }
}
