package in.github.mdrashidd.javaunitconverter.model;
import java.math.BigDecimal;

public enum LengthUnit implements Unit{
	METER("Meter", "m", "1.0"),                      
    KILOMETER("Kilometer", "km", "1000.0"),
    CENTIMETER("Centimeter", "cm", "0.01"),
    MILLIMETER("Millimeter", "mm", "0.001"),
    MILE("Mile", "mi", "1609.344"),
    YARD("Yard", "yd", "0.9144"),
    FOOT("Foot", "ft", "0.3048"),
    INCH("Inch", "in", "0.0254");
	
	private final String UnitName;
	private final String UnitSymbol;
	private final BigDecimal factorToMeter;
	
	LengthUnit(String UnitName, String UnitSymbol, String factorToMeter){
		this.UnitName =UnitName;
		this.UnitSymbol = UnitSymbol;
		this.factorToMeter =new BigDecimal(factorToMeter);
	}

	@Override
	public String getUnitName() {
		return this.UnitName;
	}

	@Override
	public String getUnitSymbol() {
		return this.UnitSymbol;
	}

	@Override
	public UnitType getUnitType() {
		return UnitType.LENGTH;
	}
	
	public BigDecimal getFactor() {
		return this.factorToMeter;
	}

}
