package ast;

import util.ImpTable;
import visitor.Visitor;

public class FunctionCall extends Expression {

	public final String identifier;
	public final NodeList<Expression> expressions;
	public ImpTable<Type> variables;
	
	public FunctionCall(String identifier, NodeList<Expression> expressions) {
		super();
		this.identifier = identifier;
		this.expressions = expressions;
	}
	
	@Override
	public <R> R accept(Visitor<R> v) {
		return v.visit(this);
	}

	
}