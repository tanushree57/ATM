
public class NewTax implements TaxInterface {

	@Override
	public double Calc_Tax(double amt) {
		FinAPI tax = new FinAPI();
		return tax.tax_calc(amt);
	}
}
