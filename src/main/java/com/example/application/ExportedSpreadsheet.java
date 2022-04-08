package com.example.application;

import com.vaadin.flow.component.WebComponentExporter;
import com.vaadin.flow.component.spreadsheet.Spreadsheet;
import com.vaadin.flow.component.webcomponent.WebComponent;

public class ExportedSpreadsheet extends WebComponentExporter<Spreadsheet> {

    public ExportedSpreadsheet() {
        super("spread-sheet", false);
    }

    @Override
    protected void configureInstance(WebComponent<Spreadsheet> webComponent, Spreadsheet spreadsheet) {
        // webComponent.set
        
    }

}
