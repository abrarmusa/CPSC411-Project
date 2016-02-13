package ast;

import visitor.Visitor;

public class FunctionDeclaration extends Statement {
	
	public final Type type;
	public final IdentifierExp identifier;
	public final FormalList parameters;
	public final NodeList<Assign> body;
	public final Expression retValue;
	

	
	public FunctionDeclaration(Type type, IdentifierExp identifier, FormalList parameters, NodeList<Assign> body, Expression retValue) {
		super();
		this.type = type;
		this.identifier = identifier;
		this.parameters = parameters;
		this.body = body;
		this.retValue = retValue;
	}

	@Override
	public <R> R accept(Visitor<R> v) {
		return v.visit(this);
	}
}
