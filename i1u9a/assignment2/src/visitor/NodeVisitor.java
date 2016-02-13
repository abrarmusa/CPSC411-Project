package visitor;

import ast.AST;
import ast.Assign;
import ast.BooleanType;
import ast.Conditional;
import ast.IdentifierExp;
import ast.IntegerLiteral;
import ast.IntegerType;
import ast.LessThan;
import ast.Minus;
import ast.NodeList;
import ast.Not;
import ast.Plus;
import ast.Print;
import ast.Program;
import ast.Times;
import ast.UnknownType;

public class NodeVisitor<R> implements Visitor<Integer> {

	@Override
	public Integer visit(Program n) {
		int count = 1;
		count += n.statements.accept(this);
		count += n.print.accept(this);
		return count;
	}

	@Override
	public Integer visit(Print n) {
		int count = 1;
		count += n.exp.accept(this);
		return count;
	}

	@Override
	public Integer visit(Assign n) {
		int count = 1;
		count += n.name.accept(this);
		count += n.value.accept(this);
		return count;
	}

	@Override
	public Integer visit(LessThan n) {
		int count = 1;
		count += n.e1.accept(this);
		count += n.e2.accept(this);
		return count;
	}

	@Override
	public Integer visit(Conditional n) {
		int count = 1;
		count += n.e1.accept(this);
		count += n.e2.accept(this);
		count += n.e3.accept(this);
		return count;
	}

	@Override
	public Integer visit(Plus n) {
		int count = 1;
		count += n.e1.accept(this);
		count += n.e2.accept(this);
		return count;
	}

	@Override
	public Integer visit(Minus n) {
		int count = 1;
		count += n.e1.accept(this);
		count += n.e2.accept(this);
		return count;
	}

	@Override
	public Integer visit(Times n) {
		int count = 1;
		count += n.e1.accept(this);
		count += n.e2.accept(this);
		return count;
	}

	@Override
	public Integer visit(IntegerLiteral n) {
		return 1;
	}

	@Override
	public Integer visit(IdentifierExp n) {
		return 1;
	}

	@Override
	public Integer visit(Not not) {
		int count = 1;
		count += not.e.accept(this);
		return count;
	}

	@Override
	public Integer visit(IntegerType n) {
		return 1;
	}

	@Override
	public Integer visit(BooleanType n) {
		return 1;
	}

	@Override
	public Integer visit(UnknownType n) {
		return 1;
	}

	@Override
	public <T extends AST> Integer visit(NodeList<T> ns) {
		int count = 0;
		for (int i = 0; i < ns.size(); i++) {
			count += ns.elementAt(i).accept(this);
		}
		return count;
	}

}


