/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FArrays1 extends org.jooq.impl.AbstractRoutine<java.lang.Integer[]> {

	private static final long serialVersionUID = 768410123;

	/**
	 * The parameter <code>PUBLIC.F_ARRAYS1.RETURN_VALUE</code>.
	 */
	public static final org.jooq.Parameter<java.lang.Integer[]> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER.getArrayDataType());

	/**
	 * The parameter <code>PUBLIC.F_ARRAYS1.IN_ARRAY</code>.
	 */
	public static final org.jooq.Parameter<java.lang.Integer[]> IN_ARRAY = createParameter("IN_ARRAY", org.jooq.impl.SQLDataType.INTEGER.getArrayDataType());

	/**
	 * Create a new routine call instance
	 */
	public FArrays1() {
		super("F_ARRAYS1", org.jooq.test.hsqldb.generatedclasses.Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.getArrayDataType());

		setReturnParameter(RETURN_VALUE);
		addInParameter(IN_ARRAY);
	}

	/**
	 * Set the <code>IN_ARRAY</code> parameter IN value to the routine
	 */
	public void setInArray(java.lang.Integer[] value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.routines.FArrays1.IN_ARRAY, value);
	}

	/**
	 * Set the <code>IN_ARRAY</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setInArray(org.jooq.Field<java.lang.Integer[]> field) {
		setField(IN_ARRAY, field);
	}
}
