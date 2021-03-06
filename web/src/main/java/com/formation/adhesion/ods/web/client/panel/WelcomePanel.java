package com.formation.adhesion.ods.web.client.panel;

import com.formation.adhesion.ods.core.model.Statistics;
import com.formation.adhesion.ods.web.shared.service.DataLoaderService;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;

public class WelcomePanel extends Composite {

	private static ApplicationDesktopUiBinder uiBinder = GWT
			.create(ApplicationDesktopUiBinder.class);
	@UiField Button chargeBase;

	interface ApplicationDesktopUiBinder extends
			UiBinder<Widget, WelcomePanel> {
	}

	public WelcomePanel() {
		initWidget(uiBinder.createAndBindUi(this));
	}


	public WelcomePanel(String firstName) {
		initWidget(uiBinder.createAndBindUi(this));
		

	}



	@UiHandler("chargeBase")
	void onChargeBaseClick(ClickEvent event) {
		DataLoaderService.Util.getInstance().loadData( new AsyncCallback<Void>() {

			@Override
			public void onFailure(Throwable caught) {
				Window.alert("Erreur chargement :"+caught);
				
			}

			@Override
			public void onSuccess(Void result) {
				
				Window.alert("Données chargées");
			}
		
		});
	}
}
