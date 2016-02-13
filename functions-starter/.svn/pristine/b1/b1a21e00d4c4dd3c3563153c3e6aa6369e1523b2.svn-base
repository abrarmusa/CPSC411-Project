package ast;


import visitor.Visitor;

public class FormalList extends AST {
	
	public final NodeList<Type> types;
	public final NodeList<IdentifierExp> identifiers;
	
	public FormalList(NodeList<Type> types,NodeList<IdentifierExp> identifiers) {
		super();
		this.types = types;
		this.identifiers = identifiers;
	}
	

	@Override
	public <R> R accept(Visitor<R> v) {
		return v.visit(this);
	}
}
