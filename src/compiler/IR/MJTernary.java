package compiler.IR;

public class MJTernary extends MJExpression {

	private MJExpression condition;
	private MJExpression trueExpr;
	private MJExpression falseExpr;

	public MJTernary(MJExpression condition, MJExpression trueExpr, MJExpression falseExpr) {
		this.condition=condition;
		this.trueExpr=trueExpr;
		this.falseExpr=falseExpr;
	}

	public MJExpression getCondition() {
		return condition;
	}

	public void setCondition(MJExpression condition) {
		this.condition = condition;
	}

	public MJExpression getTrueExpr() {
		return trueExpr;
	}

	public void setTrueExpr(MJExpression trueExpr) {
		this.trueExpr = trueExpr;
	}

	public MJExpression getFalseExpr() {
		return falseExpr;
	}

	public void setFalseExpr(MJExpression falseExpr) {
		this.falseExpr = falseExpr;
	}

}
