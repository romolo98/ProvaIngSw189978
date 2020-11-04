package Esercitazione.MyListUtil;

import java.util.ArrayList;

public class MyListUtil 
{
	private ArrayList<Integer> array = new ArrayList<Integer>();
	
	public void riempiArray() {
		for (int i=0;i<20;i++) {
			array.add(i);
		}
	}
	
	public ArrayList<Integer> getArray () {
		return array;
	}
	
	public void SortCrescente () {
		int index = 0;
		for (int i=0; i<array.size();i++) {
			for (int j = 0; j<array.size(); j++) {
				if (array.get(i) < array.get(j)) {
					index = array.get(i);
					array.set(i,array.get(j));
					array.set(j, index);
				}
			}
		}
	
	}
	
	public void SortDecrescente () {
		int index = 0;
		for (int i=0; i<array.size();i++) {
			for (int j = 0; j<array.size(); j++) {
				if (array.get(i) > array.get(j)) {
					index = array.get(i);
					array.set(i,array.get(j));
					array.set(j, index);
				}
			}
		}
	}
	
}