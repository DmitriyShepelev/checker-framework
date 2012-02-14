package checkers.flow.cfg.node;

import java.util.Collection;
import java.util.Collections;

import checkers.flow.util.HashCodeUtils;

import com.sun.source.tree.Tree;
import com.sun.source.tree.Tree.Kind;

/**
 * A node for the string conversion operation.  See JLS 5.1.11
 * for the definition of string conversion.
 *
 * A {@link StringConversionNode} does not correspond to any tree node
 * in the parsed AST.  It is introduced when a value of non-string
 * type appears in a context that requires a {@link String}, such as
 * in a string concatenation.  A {@link StringConversionNode} should
 * be treated as a potential call to the toString method of its
 * operand, but does not necessarily call any method because null is
 * converted to the string "null".
 *
 * Conversion of primitive types to Strings requires first boxing and
 * then string conversion.  We represent that as two separate {@link
 * Node}s, first a {@link BoxingNode} and then a {@link
 * StringConversionNode}.
 * 
 * @author Stefan Heule
 * @author Charlie Garrett
 * 
 */
public class StringConversionNode extends Node {

	protected Node operand;

	public StringConversionNode(Node operand) {
		this.operand = operand;
	}

	public Node getOperand() {
		return operand;
	}

	@Override
	public Tree getTree() {
		return null;
	}

	@Override
	public <R, P> R accept(NodeVisitor<R, P> visitor, P p) {
		return visitor.visitStringConversion(this, p);
	}

	@Override
	public String toString() {
		return "StringConversion(" + getOperand() + ")";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof StringConversionNode)) {
			return false;
		}
		StringConversionNode other = (StringConversionNode) obj;
		return getOperand().equals(other.getOperand());
	}
	
	@Override
	public int hashCode() {
		return HashCodeUtils.hash(getOperand());
	}

	@Override
	public Collection<Node> getOperands() {
		return Collections.singletonList(getOperand());
	}
}
