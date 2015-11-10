package compiler.IR;

public class MJLinq extends MJExpression {

	private MJIdentifierClass fromIdent; 
	private MJExpression inExpression;
	private MJExpression whereExpression;
	private MJExpression selectExpression;

	public MJLinq(MJIdentifierClass fromIdent, MJExpression inExpression, 
			MJExpression whereExpression,
			MJExpression selectExpression) {
		this.fromIdent = fromIdent;
		this.inExpression = inExpression;
		this.whereExpression = whereExpression;
		this.selectExpression = selectExpression;
	}

	public MJIdentifierClass getFromIdent() {
		return fromIdent;
	}

	public void setFromIdent(MJIdentifierClass fromIdent) {
		this.fromIdent = fromIdent;
	}

	public MJExpression getInExpression() {
		return inExpression;
	}

	public void setInExpression(MJExpression inExpression) {
		this.inExpression = inExpression;
	}

	public MJExpression getWhereExpression() {
		return whereExpression;
	}

	public void setWhereExpression(MJExpression whereExpression) {
		this.whereExpression = whereExpression;
	}

	public MJExpression getSelectExpression() {
		return selectExpression;
	}

	public void setSelectExpression(MJExpression selectExpression) {
		this.selectExpression = selectExpression;
	}

}
