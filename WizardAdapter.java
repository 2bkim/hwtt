class WizardAdapter extends Wizard implements WizardInterface {
	public void attack() {
		super.shot_fire_ball();
	}
	public void defend() {
		super.shield();
	}
	public void escape() {
		super.portal();
	}
}
