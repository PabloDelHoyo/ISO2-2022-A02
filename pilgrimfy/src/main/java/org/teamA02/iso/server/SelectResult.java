package org.teamA02.iso.server;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SelectResult {

	private List<Row> records;

	public SelectResult() {
		records = new ArrayList<>();
	}

	public Optional<String[]> getAllAtributesName() {
		if (!isEmpty()) {
			return Optional.of(getRow(1).getAttributeNames());
		}

		return Optional.empty();
	}

	public SelectResult(int initialCapacity) {
		records = new ArrayList<>(initialCapacity);
	}

	public boolean isEmpty() {
		// Assuming Broker is the only one which generates instances of this class
		return records.size() == 0;
	}

	public List<Row> getRecords() {
		return records;
	}

	public Row getRow(int rowNum) {
		return records.get(rowNum - 1);
	}

	public void addAttribute(String attributeLabel, Object value) {
		records.get(records.size() - 1).addAttribute(attributeLabel, value);
	}

	public void insertRow() {
		records.add(new Row());
	}

}
