package com.example.application.views.flow;

import java.io.IOException;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.spreadsheet.Spreadsheet;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Flow")
@Route(value = "flow")
public class FlowView extends HorizontalLayout {

    private Spreadsheet spreadsheet;

    public FlowView() throws IOException {
        setWidth("100%");
        spreadsheet = new Spreadsheet(getClass().getResourceAsStream("empty.xlsx"));
        spreadsheet.setWidth("100%");
        spreadsheet.setHeight("500px");
        add(spreadsheet);
    }

}
