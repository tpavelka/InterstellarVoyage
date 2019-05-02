
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTextArea;


public class StarsGUI extends JFrame
					  implements ItemListener, ActionListener {
	
	private StarMath StarMath;
	
	private double[] positionOfStar1;
	
	private String[]  relatedStar;
	private List<String> selectedStars;
	public static Map<String, Stars> starNameToStar = new HashMap<String, Stars>();
	
	private JLabel    notice;
	private JCheckBox Sol;
	private JCheckBox AlphaCentauri;
	private JCheckBox EpsilonEridani;
	private JCheckBox _61Cygni;
	private JCheckBox EpsilonIndi;
	private JCheckBox TauCeti;
	private JCheckBox _40Eridani;
	private JCheckBox _70Ophiuchi;
	private JCheckBox SigmaDraconis;
	private JCheckBox EtaCassiopeiae;
	private JCheckBox _36Ophiuchi;
	private JCheckBox eEridani;
	private JCheckBox XiBootis;
	private JCheckBox _107Piscium;
	private JCheckBox FomalhautB;
	private JCheckBox pEridani;
	private JCheckBox Pi_3Orionis;
	private JCheckBox XiUrsaeMajoris;
	private JCheckBox BetaCanumVenaticorum;
	private JCheckBox Kappa_1Ceti;
	private JCheckBox GammaPavonis;
	private JCheckBox _61UrsaeMajoris;
	private JCheckBox _12Ophiuchi;
	private JCheckBox AlphaMensae;
	private JCheckBox IotaPersei;
	private JCheckBox BetaVirginis;
	private JCheckBox _54Piscium;
	private JCheckBox ThetaPersei;
	private JCheckBox GammaSerpentis;
	private JCheckBox Zeta_1Reticuli;
	private JCheckBox Zeta_2Reticuli;
	private JCheckBox LambdaSerpentis;
	private JCheckBox LambdaAurigae;
	private JCheckBox UpsilonAndromedae;
	private JCheckBox _18Scorpii;
	private JButton   uncheckAll;
	private JTextArea data;
	
	public StarsGUI(){
		relatedStar = new String[35];
		selectedStars = new ArrayList<String>();
		for(int i = 0; i < 35; i++){
			relatedStar[i] = Stars.values()[i].getName();
		}
		
		
		setTitle("Interstallar Voyage Planner Helper Version 1.00 - Made by Travis Austin Pavelka");
		setSize(799,461);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setVisible(true);
		
		StarMath = new StarMath();
		notice = new JLabel("Check Only One or Two Stars at a Time to Display Data:");
		Sol = new JCheckBox(Stars.Sol.getName());
		AlphaCentauri = new JCheckBox(Stars.AlphaCentauri.getName());
		EpsilonEridani = new JCheckBox(Stars.EpsilonEridani.getName());
		_61Cygni = new JCheckBox(Stars._61Cygni.getName());
		EpsilonIndi = new JCheckBox(Stars.EpsilonIndi.getName());
		TauCeti = new JCheckBox(Stars.TauCeti.getName());
		_40Eridani = new JCheckBox(Stars._40Eridani.getName());
		_70Ophiuchi = new JCheckBox(Stars._70Ophiuchi.getName());
		SigmaDraconis = new JCheckBox(Stars.SigmaDraconis.getName());
		EtaCassiopeiae = new JCheckBox(Stars.EtaCassiopeiae.getName());
		_36Ophiuchi = new JCheckBox(Stars._36Ophiuchi.getName());
		eEridani = new JCheckBox(Stars.eEridani.getName());
		XiBootis = new JCheckBox(Stars.XiBootis.getName());
		_107Piscium = new JCheckBox(Stars._107Piscium.getName());
		FomalhautB = new JCheckBox(Stars.FomalhautB.getName());
		pEridani = new JCheckBox(Stars.pEridani.getName());
		Pi_3Orionis = new JCheckBox(Stars.Pi_3Orionis.getName());
		XiUrsaeMajoris = new JCheckBox(Stars.XiUrsaeMajoris.getName());
		BetaCanumVenaticorum = new JCheckBox(Stars.BetaCanumVenaticorum.getName());
		Kappa_1Ceti = new JCheckBox(Stars.Kappa_1Ceti.getName());
		GammaPavonis = new JCheckBox(Stars.GammaPavonis.getName());
		_61UrsaeMajoris = new JCheckBox(Stars._61UrsaeMajoris.getName());
		_12Ophiuchi = new JCheckBox(Stars._12Ophiuchi.getName());
		AlphaMensae = new JCheckBox(Stars.AlphaMensae.getName());
		IotaPersei = new JCheckBox(Stars.IotaPersei.getName());
		BetaVirginis = new JCheckBox(Stars.BetaVirginis.getName());
		_54Piscium = new JCheckBox(Stars._54Piscium.getName());
		ThetaPersei = new JCheckBox(Stars.ThetaPersei.getName());
		GammaSerpentis = new JCheckBox(Stars.GammaSerpentis.getName());
		Zeta_1Reticuli = new JCheckBox(Stars.Zeta_1Reticuli.getName());
		Zeta_2Reticuli = new JCheckBox(Stars.Zeta_2Reticuli.getName());
		LambdaSerpentis = new JCheckBox(Stars.LambdaSerpentis.getName());
		LambdaAurigae = new JCheckBox(Stars.LambdaAurigae.getName());
		UpsilonAndromedae = new JCheckBox(Stars.UpsilonAndromedae.getName());
		_18Scorpii = new JCheckBox(Stars._18Scorpii.getName());
		uncheckAll = new JButton("Uncheck All");
		data = new JTextArea(15, 70);
		
		
		
		Sol.addItemListener(this);
		AlphaCentauri.addItemListener(this);
		EpsilonEridani.addItemListener(this);
		_61Cygni.addItemListener(this);
		EpsilonIndi.addItemListener(this);
		TauCeti.addItemListener(this);
		_40Eridani.addItemListener(this);
		_70Ophiuchi.addItemListener(this);
		SigmaDraconis.addItemListener(this);
		EtaCassiopeiae.addItemListener(this);
		_36Ophiuchi.addItemListener(this);
		eEridani.addItemListener(this);
		XiBootis.addItemListener(this);
		_107Piscium.addItemListener(this);
		FomalhautB.addItemListener(this);
		pEridani.addItemListener(this);
		Pi_3Orionis.addItemListener(this);
		XiUrsaeMajoris.addItemListener(this);
		BetaCanumVenaticorum.addItemListener(this);
		Kappa_1Ceti.addItemListener(this);
		GammaPavonis.addItemListener(this);
		_61UrsaeMajoris.addItemListener(this);
		_12Ophiuchi.addItemListener(this);
		AlphaMensae.addItemListener(this);
		IotaPersei.addItemListener(this);
		BetaVirginis.addItemListener(this);
		_54Piscium.addItemListener(this);
		ThetaPersei.addItemListener(this);
		GammaSerpentis.addItemListener(this);
		Zeta_1Reticuli.addItemListener(this);
		Zeta_2Reticuli.addItemListener(this);
		LambdaSerpentis.addItemListener(this);
		LambdaAurigae.addItemListener(this);
		UpsilonAndromedae.addItemListener(this);
		_18Scorpii.addItemListener(this);
		uncheckAll.addActionListener(this);
		uncheckAll.setActionCommand("uncheckAll");
		data.setLineWrap(true);
		data.setWrapStyleWord(true);
		data.setText("Please select a star or a set of two stars to begin user.");
		
		
		
		add(notice);
		add(Sol);
		add(AlphaCentauri);
		add(EpsilonEridani);
		add(_61Cygni);
		add(EpsilonIndi);
		add(TauCeti);
		add(_40Eridani);
		add(_70Ophiuchi);
		add(SigmaDraconis);
		add(EtaCassiopeiae);
		add(_36Ophiuchi);
		add(eEridani);
		add(XiBootis);
		add(_107Piscium);
		add(FomalhautB);
		add(pEridani);
		add(Pi_3Orionis);
		add(XiUrsaeMajoris);
		add(BetaCanumVenaticorum);
		add(Kappa_1Ceti);
		add(GammaPavonis);
		add(_61UrsaeMajoris);
		add(_12Ophiuchi);
		add(AlphaMensae);
		add(IotaPersei);
		add(BetaVirginis);
		add(_54Piscium);
		add(ThetaPersei);
		add(GammaSerpentis);
		add(Zeta_1Reticuli);
		add(Zeta_2Reticuli);
		add(LambdaSerpentis);
		add(LambdaAurigae);
		add(UpsilonAndromedae);
		add(_18Scorpii);
		add(uncheckAll);
		add(data);
		
		
		setSize(800, 462);
	}


	@Override
	public void itemStateChanged(ItemEvent e) {
		Object source = e.getItemSelectable();
		int state = e.getStateChange();
		if(source == Sol && state == ItemEvent.SELECTED){
			selectedStars.add(Sol.getText());
		} else if (source == Sol && state == ItemEvent.DESELECTED){
			selectedStars.remove(Sol.getText());
		} else if (source == AlphaCentauri && state == ItemEvent.SELECTED){
			selectedStars.add(AlphaCentauri.getText());
		} else if (source == AlphaCentauri && state == ItemEvent.DESELECTED){
			selectedStars.remove(AlphaCentauri.getText());
		} else if (source == EpsilonEridani && state == ItemEvent.SELECTED){
			selectedStars.add(EpsilonEridani.getText());
		} else if (source == EpsilonEridani && state == ItemEvent.DESELECTED){
			selectedStars.remove(EpsilonEridani.getText());
		} else if (source == _61Cygni && state == ItemEvent.SELECTED){
			selectedStars.add(_61Cygni.getText());
		} else if (source == _61Cygni && state == ItemEvent.DESELECTED){
			selectedStars.remove(_61Cygni.getText());
		} else if (source == EpsilonIndi && state == ItemEvent.SELECTED){
			selectedStars.add(EpsilonIndi.getText());
		} else if (source == EpsilonIndi && state == ItemEvent.DESELECTED){
			selectedStars.remove(EpsilonIndi.getText());
		} else if (source == TauCeti && state == ItemEvent.SELECTED){
			selectedStars.add(TauCeti.getText());
		} else if (source == TauCeti && state == ItemEvent.DESELECTED){
			selectedStars.remove(TauCeti.getText());
		} else if (source == _40Eridani && state == ItemEvent.SELECTED){
			selectedStars.add(_40Eridani.getText());
		} else if (source == _40Eridani && state == ItemEvent.DESELECTED){
			selectedStars.remove(_40Eridani.getText());
		} else if (source == _70Ophiuchi && state == ItemEvent.SELECTED){
			selectedStars.add(_70Ophiuchi.getText());
		} else if (source == _70Ophiuchi && state == ItemEvent.DESELECTED){
			selectedStars.remove(_70Ophiuchi.getText());
		} else if (source == SigmaDraconis && state == ItemEvent.SELECTED){
			selectedStars.add(SigmaDraconis.getText());
		} else if (source == SigmaDraconis && state == ItemEvent.DESELECTED){
			selectedStars.remove(SigmaDraconis.getText());
		} else if (source == EtaCassiopeiae && state == ItemEvent.SELECTED){
			selectedStars.add(EtaCassiopeiae.getText());
		} else if (source == EtaCassiopeiae && state == ItemEvent.DESELECTED){
			selectedStars.remove(EtaCassiopeiae.getText());
		} else if (source == _36Ophiuchi && state == ItemEvent.SELECTED){
			selectedStars.add(_36Ophiuchi.getText());
		} else if (source == _36Ophiuchi && state == ItemEvent.DESELECTED){
			selectedStars.remove(_36Ophiuchi.getText());
		} else if (source == eEridani && state == ItemEvent.SELECTED){
			selectedStars.add(eEridani.getText());
		} else if (source == eEridani && state == ItemEvent.DESELECTED){
			selectedStars.remove(eEridani.getText());
		} else if (source == XiBootis && state == ItemEvent.SELECTED){
			selectedStars.add(XiBootis.getText());
		} else if (source == XiBootis && state == ItemEvent.DESELECTED){
			selectedStars.remove(XiBootis.getText());
		} else if (source == _107Piscium && state == ItemEvent.SELECTED){
			selectedStars.add(_107Piscium.getText());
		} else if (source == _107Piscium && state == ItemEvent.DESELECTED){
			selectedStars.remove(_107Piscium.getText());
		} else if (source == FomalhautB && state == ItemEvent.SELECTED){
			selectedStars.add(FomalhautB.getText());
		} else if (source == FomalhautB && state == ItemEvent.DESELECTED){
			selectedStars.remove(FomalhautB.getText());
		} else if (source == pEridani && state == ItemEvent.SELECTED){
			selectedStars.add(pEridani.getText());
		} else if (source == pEridani && state == ItemEvent.DESELECTED){
			selectedStars.remove(pEridani.getText());
		} else if (source == Pi_3Orionis && state == ItemEvent.SELECTED){
			selectedStars.add(Pi_3Orionis.getText());
		} else if (source == Pi_3Orionis && state == ItemEvent.DESELECTED){
			selectedStars.remove(Pi_3Orionis.getText());
		} else if (source == XiUrsaeMajoris && state == ItemEvent.SELECTED){
			selectedStars.add(XiUrsaeMajoris.getText());
		} else if (source == XiUrsaeMajoris && state == ItemEvent.DESELECTED){
			selectedStars.remove(XiUrsaeMajoris.getText());
		} else if (source == BetaCanumVenaticorum && state == ItemEvent.SELECTED){
			selectedStars.add(BetaCanumVenaticorum.getText());
		} else if (source == BetaCanumVenaticorum && state == ItemEvent.DESELECTED){
			selectedStars.remove(BetaCanumVenaticorum.getText());
		} else if (source == Kappa_1Ceti && state == ItemEvent.SELECTED){
			selectedStars.add(Kappa_1Ceti.getText());
		} else if (source == Kappa_1Ceti && state == ItemEvent.DESELECTED){
			selectedStars.remove(Kappa_1Ceti.getText());
		} else if (source == GammaPavonis && state == ItemEvent.SELECTED){
			selectedStars.add(GammaPavonis.getText());
		} else if (source == GammaPavonis && state == ItemEvent.DESELECTED){
			selectedStars.remove(GammaPavonis.getText());
		} else if (source == _61UrsaeMajoris && state == ItemEvent.SELECTED){
			selectedStars.add(_61UrsaeMajoris.getText());
		} else if (source == _61UrsaeMajoris && state == ItemEvent.DESELECTED){
			selectedStars.remove(_61UrsaeMajoris.getText());
		} else if (source == _12Ophiuchi && state == ItemEvent.SELECTED){
			selectedStars.add(_12Ophiuchi.getText());
		} else if (source == _12Ophiuchi && state == ItemEvent.DESELECTED){
			selectedStars.remove(_12Ophiuchi.getText());
		} else if (source == AlphaMensae && state == ItemEvent.SELECTED){
			selectedStars.add(AlphaMensae.getText());
		} else if (source == AlphaMensae && state == ItemEvent.DESELECTED){
			selectedStars.remove(AlphaMensae.getText());
		} else if (source == IotaPersei && state == ItemEvent.SELECTED){
			selectedStars.add(IotaPersei.getText());
		} else if (source == IotaPersei && state == ItemEvent.DESELECTED){
			selectedStars.remove(IotaPersei.getText());
		} else if (source == BetaVirginis && state == ItemEvent.SELECTED){
			selectedStars.add(BetaVirginis.getText());
		} else if (source == BetaVirginis && state == ItemEvent.DESELECTED){
			selectedStars.remove(BetaVirginis.getText());
		} else if (source == _54Piscium && state == ItemEvent.SELECTED){
			selectedStars.add(_54Piscium.getText());
		} else if (source == _54Piscium && state == ItemEvent.DESELECTED){
			selectedStars.remove(_54Piscium.getText());
		} else if (source == ThetaPersei && state == ItemEvent.SELECTED){
			selectedStars.add(ThetaPersei.getText());
		} else if (source == ThetaPersei && state == ItemEvent.DESELECTED){
			selectedStars.remove(ThetaPersei.getText());
		} else if (source == GammaSerpentis && state == ItemEvent.SELECTED){
			selectedStars.add(GammaSerpentis.getText());
		} else if (source == GammaSerpentis && state == ItemEvent.DESELECTED){
			selectedStars.remove(GammaSerpentis.getText());
		} else if (source == Zeta_1Reticuli && state == ItemEvent.SELECTED){
			selectedStars.add(Zeta_1Reticuli.getText());
		} else if (source == Zeta_1Reticuli && state == ItemEvent.DESELECTED){
			selectedStars.remove(Zeta_1Reticuli.getText());
		} else if (source == Zeta_2Reticuli && state == ItemEvent.SELECTED){
			selectedStars.add(Zeta_2Reticuli.getText());
		} else if (source == Zeta_2Reticuli && state == ItemEvent.DESELECTED){
			selectedStars.remove(Zeta_2Reticuli.getText());
		} else if (source == LambdaSerpentis && state == ItemEvent.SELECTED){
			selectedStars.add(LambdaSerpentis.getText());
		} else if (source == LambdaSerpentis && state == ItemEvent.DESELECTED){
			selectedStars.remove(LambdaSerpentis.getText());
		} else if (source == LambdaAurigae && state == ItemEvent.SELECTED){
			selectedStars.add(LambdaAurigae.getText());
		} else if (source == LambdaAurigae && state == ItemEvent.DESELECTED){
			selectedStars.remove(LambdaAurigae.getText());
		} else if (source == UpsilonAndromedae && state == ItemEvent.SELECTED){
			selectedStars.add(UpsilonAndromedae.getText());
		} else if (source == UpsilonAndromedae && state == ItemEvent.DESELECTED){
			selectedStars.remove(UpsilonAndromedae.getText());
		} else if (source == _18Scorpii && state == ItemEvent.SELECTED){
			selectedStars.add(_18Scorpii.getText());
		} else if (source == _18Scorpii && state == ItemEvent.DESELECTED){
			selectedStars.remove(_18Scorpii.getText());
		}
		if(selectedStars.toArray().length == 0){
			data.setText("Please select a star or a set of two stars.");
		} else if(selectedStars.toArray().length == 1){
			positionOfStar1 = StarMath.getCartesianCoords(starNameToStar.get(selectedStars.toArray()[0]));
			data.setText("Data on star \""+selectedStars.toArray()[0]+"\":"+
							"\n\n"+
							"Position in Celestial Coordinates:\n"+
							"This star has "+starNameToStar.get(selectedStars.toArray()[0]).getRAh()+" hour(s), "+
									starNameToStar.get(selectedStars.toArray()[0]).getRAm()+" minute(s), and "+
									starNameToStar.get(selectedStars.toArray()[0]).getRAs()+" second(s) of Right Ascension.\n"+
							"It has a Declination of "+ starNameToStar.get(selectedStars.toArray()[0]).getDdeg()+
									" degrees and "+starNameToStar.get(selectedStars.toArray()[0]).getDdegm()+" minutes.\n"+
							"\n"+
							"It is "+starNameToStar.get(selectedStars.toArray()[0]).getDist()+" light-years away from Sol.\n"+
							"\n"+
							"Position in Cartesian Coordinates with light-years as the unit of measurement (Origin at Sol):\n"+
							"x: "+positionOfStar1[0]+"\n"+
							"y: "+positionOfStar1[1]+"\n"+
							"z: "+positionOfStar1[2]+"\n"
							);
		} else if(selectedStars.toArray().length == 2){
			data.setText("Related information on stars \""+selectedStars.toArray()[0]+"\" and \""+selectedStars.toArray()[1]+"\".\n"+
							"\n"+
							"The distance between these stars in light-years: "+
									StarMath.calculateDistanceBetweenStars(starNameToStar.get(selectedStars.toArray()[0]),
									starNameToStar.get(selectedStars.toArray()[1]))
							);
		} else if(selectedStars.toArray().length > 2){
			data.setText("Please select only one or two stars at a time.");
		}
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		Object command = e.getActionCommand();
		if(command == "uncheckAll"){
			Sol.setSelected(false);
			AlphaCentauri.setSelected(false);
			EpsilonEridani.setSelected(false);
			_61Cygni.setSelected(false);
			EpsilonIndi.setSelected(false);
			TauCeti.setSelected(false);
			_40Eridani.setSelected(false);
			_70Ophiuchi.setSelected(false);
			SigmaDraconis.setSelected(false);
			EtaCassiopeiae.setSelected(false);
			_36Ophiuchi.setSelected(false);
			eEridani.setSelected(false);
			XiBootis.setSelected(false);
			_107Piscium.setSelected(false);
			FomalhautB.setSelected(false);
			pEridani.setSelected(false);
			Pi_3Orionis.setSelected(false);
			XiUrsaeMajoris.setSelected(false);
			BetaCanumVenaticorum.setSelected(false);
			Kappa_1Ceti.setSelected(false);
			GammaPavonis.setSelected(false);
			_61UrsaeMajoris.setSelected(false);
			_12Ophiuchi.setSelected(false);
			AlphaMensae.setSelected(false);
			IotaPersei.setSelected(false);
			BetaVirginis.setSelected(false);
			_54Piscium.setSelected(false);
			ThetaPersei.setSelected(false);
			GammaSerpentis.setSelected(false);
			Zeta_1Reticuli.setSelected(false);
			Zeta_2Reticuli.setSelected(false);
			LambdaSerpentis.setSelected(false);
			LambdaAurigae.setSelected(false);
			UpsilonAndromedae.setSelected(false);
			_18Scorpii.setSelected(false);
		}
	}
}
