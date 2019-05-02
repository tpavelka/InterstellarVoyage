
public enum Stars {
	Sol                 ("Sol",                     0,  0,  0,  0,  0.0,  0.00),
	AlphaCentauri       ("Alpha Centauri",         14, 39, 36,-60, 50.0,  4.37),
	EpsilonEridani      ("Epsilon Eridani",         3, 32, 56, -9, 27.5, 10.48),
	_61Cygni            ("61 Cygni",               21,  6, 54, 38, 45.0, 11.40),
	EpsilonIndi         ("Epsilon Indi",           22,  3, 22,-56, 47.2, 11.81),
	TauCeti             ("Tau Ceti",                1, 44,  4,-15, 56.2, 11.90),
	_40Eridani          ("40 Eridani",              4, 15, 16, -7, 39.2, 16.25),
	_70Ophiuchi         ("70 Ophiuchi",            18,  5, 27, -2, 30.0, 16.64),
	SigmaDraconis       ("Sigma Draconis",         19, 32, 22, 69, 39.7, 18.77),
	EtaCassiopeiae      ("Eta Cassiopeiae",         0, 49,  6, 57, 48.9, 19.39),
	_36Ophiuchi         ("36 Ophiuchi",            17, 15, 21,-26, 36.2, 19.40),
	eEridani            ("e Eridani",               3, 19, 56,-43,  4.2, 19.71),
	XiBootis            ("Xi Bootis",              14, 51, 23, 19,  6.0, 22.10),
	_107Piscium         ("107 Piscium",             1, 42, 30, 20, 16.1, 24.57),
	FomalhautB          ("Fomalhaut B",            22, 56, 24,-31, 33.9, 24.82),
	pEridani            ("p Eridani",               1, 39, 48,-56, 11.8, 25.51),
	Pi_3Orionis         ("Pi-3 Orionis",            4, 49, 50,  6, 57.7, 26.32),
	XiUrsaeMajoris      ("Xi Ursae Majoris",       11, 18, 11, 31, 31.8, 27.29),
	BetaCanumVenaticorum("Beta Canum Venaticorum", 12, 33, 45, 41, 21.4, 27.53),
	Kappa_1Ceti         ("Kappa-1 Ceti",            3, 19, 22,  3, 22.2, 29.81),
	GammaPavonis        ("Gamma Pavonis",          21, 26, 27,-65, 22.0, 30.21),
	_61UrsaeMajoris     ("61 Ursae Majoris",       11, 41,  3, 34, 12.1, 31.35),
	_12Ophiuchi         ("12 Ophiuchi",            16, 36, 21, -2, 19.5, 31.81),
	AlphaMensae         ("Alpha Mensae",            6, 10, 14,-74, 45.2, 33.26),
	IotaPersei          ("Iota Persei",             3,  9,  4, 49, 36.8, 34.38),
	BetaVirginis        ("Beta Virginis",          11, 50, 42,  1, 45.9, 35.65),
	_54Piscium          ("54 Piscium",              0, 39, 22, 21, 15.0, 36.07),
	ThetaPersei         ("Theta Persei",            2, 44, 12, 49, 13.7, 36.29),
	GammaSerpentis      ("Gamma Serpentis",        15, 56, 27, 15, 39.7, 36.71),
	Zeta_1Reticuli      ("Zeta-1 Reticuli",         3, 17, 46,-62, 34.5, 39.17),
	Zeta_2Reticuli      ("Zeta-2 Reticuli",         3, 18, 13,-62, 30.4, 39.25),
	LambdaSerpentis     ("Lambda Serpentis",       15, 45, 27,  7, 21.2, 39.55),
	LambdaAurigae       ("Lambda Aurigae",          5, 19,  8, 40,  5.9, 41.20),
	UpsilonAndromedae   ("Upsilon Andromedae",      1, 36, 48, 41, 24.3, 43.93),
	_18Scorpii          ("18 Scorpii",             16, 15, 37, -8, 22.2, 45.34);
	private String name;
	private double RAh;
	private double RAm;
	private double RAs;
	private double Ddeg;
	private double Ddegm;
	private double dist;
	Stars(String name, double RAh, double RAm, double RAs, double Ddeg, double Ddegm, double dist){
		this.name = name;
		this.RAh = RAh;
		this.RAm = RAm;
		this.RAs = RAs;
		this.Ddeg = Ddeg;
		this.Ddegm = Ddegm;
		this.dist = dist;
		StarsGUI.starNameToStar.put(name, this);
	}
	public String getName(){
		return this.name;
	}
	public double getRAh(){
		return this.RAh;
	}
	public double getRAm(){
		return this.RAm;
	}
	public double getRAs(){
		return this.RAs;
	}
	public double getDdeg(){
		return this.Ddeg;
	}
	public double getDdegm(){
		return this.Ddegm;
	}
	public double getDist(){
		return this.dist;
	}
}
