package by.avm.part5.ex4.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import by.htp.part5.ex4.entity.Treasure;

public class TreasureResourse {

	File file = new File("C:\\Users\\Andrey_wk\\eclipse-workspace\\jd1-part5-OOP-ex4\\resourses\\notes.txt");

	String separator = ",";

	public List<Treasure> loadTreasureList() {
		List<Treasure> treasures = new ArrayList<Treasure>();
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line = "";
			while ((line = br.readLine()) != null) {
				String[] strTemp = line.split(separator);

				Treasure treasure = new Treasure(Integer.parseInt(strTemp[0]), strTemp[1],
						Integer.parseInt(strTemp[2]));
				treasures.add(treasure);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return treasures;
	}

	public List<Treasure> loadTreasureOneByOne(int index) {

		List<Treasure> treasures = new ArrayList<Treasure>();
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line = "";

			for (int i = 0; i < index; i++) {
				if ((line = br.readLine()) != null) {
					String[] strTemp = line.split(separator);

					Treasure treasure = new Treasure(Integer.parseInt(strTemp[0]), strTemp[1],
							Integer.parseInt(strTemp[2]));
					treasures.add(treasure);
				}
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return treasures;

	}

}
