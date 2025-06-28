package in.github.mdrashidd.javaunitconverter.model;
import java.math.BigDecimal;
import java.util.Objects;

public final class Measurement {
	private final BigDecimal value;
	private final Unit unit;
	
	public Measurement(BigDecimal value, Unit unit){
		this.value= Objects.requireNonNull(value, "Unit can not be null");
		this.unit= Objects.requireNonNull(unit , "Must contain a unit");
	}
	
	BigDecimal getValue() {
		return this.value;
	}
	
	Unit getUnit() {
		return this.unit;
	}
	
	@Override
	public String toString(){
		return value.toPlainString()+" "+unit.getUnitSymbol();
	}
	
	@Override
	public boolean equals(Object o) {
		if(this==o) return true;
		if(o==null ||  getClass() != o.getClass()) return false;
		Measurement that= (Measurement) o;
		return value.compareTo(this.value)==0 || Objects.equals(unit, this.unit);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(value.stripTrailingZeros(),unit);
	}
	
	
}
