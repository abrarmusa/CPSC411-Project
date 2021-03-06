package ast;

import visitor.Visitor;

public class UnknownType extends Type {

	@Override
	public <R> R accept(Visitor<R> v) {
		return v.visit(this);
	}

	@Override
	public boolean equals(Object other) {
		return this.getClass()==other.getClass();
	}
	
}
