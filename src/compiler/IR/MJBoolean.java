package compiler.IR;

public class MJBoolean extends MJExpression {

	private enum MJBooleanValues {
		True, False
	};

	private MJBooleanValues value;

	public static MJBoolean False = new MJBoolean(MJBooleanValues.False);
	public static MJBoolean True = new MJBoolean(MJBooleanValues.True);

	public MJBoolean() {}
	
	public MJBoolean(MJBooleanValues value) {
		this.value = value;
	}

	public boolean isTrue() {
		return (this.value == MJBooleanValues.True);
	}

	public boolean isFalse() {
		return (this.value == MJBooleanValues.False);
	}

}
