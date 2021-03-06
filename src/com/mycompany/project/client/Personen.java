package com.mycompany.project.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class Personen extends PopupPanel {
	static Grid ergebnisGrid = new Grid();
	static VerticalPanel verticalpanel = new VerticalPanel();
	static ScrollPanel scrollpanel = new ScrollPanel();
	static HorizontalPanel horizontalpanel = new HorizontalPanel();
	static Button buttonSuchen = new Button("Suchen");
	static Button buttonEinfuegen = new Button("Einfuegen");
	static Button button2 = new Button("Aendern");
	static Button buttonLoeschen = new Button("Loeschen");
	
	
	public Personen(){
		super();
		setSize("850px", "800px");
		
		
		buttonSuchen.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				new PersonenSuche().center();
			}
		});
		buttonEinfuegen.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				new PersonenEinfuegen().center();
				
			}
		});
		buttonLoeschen.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				
			}
		});
		
		horizontalpanel.add(buttonSuchen);
		horizontalpanel.add(buttonEinfuegen);
		horizontalpanel.add(button2);
		horizontalpanel.add(buttonLoeschen);
		verticalpanel.add(horizontalpanel);
		scrollpanel.add(ergebnisGrid);
		verticalpanel.add(scrollpanel);
		verticalpanel.setCellHeight(horizontalpanel, "50px");
		add(verticalpanel);		
		
	}
	
}
