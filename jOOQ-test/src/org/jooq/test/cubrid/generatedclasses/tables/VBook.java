/**
 * This class is generated by jOOQ
 */
package org.jooq.test.cubrid.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VBook extends org.jooq.impl.TableImpl<org.jooq.test.cubrid.generatedclasses.tables.records.VBookRecord> {

	private static final long serialVersionUID = -1924428325;

	/**
	 * The singleton instance of <code>v_book</code>
	 */
	public static final org.jooq.test.cubrid.generatedclasses.tables.VBook V_BOOK = new org.jooq.test.cubrid.generatedclasses.tables.VBook();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.cubrid.generatedclasses.tables.records.VBookRecord> getRecordType() {
		return org.jooq.test.cubrid.generatedclasses.tables.records.VBookRecord.class;
	}

	/**
	 * The column <code>v_book.id</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.VBookRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, V_BOOK);

	/**
	 * The column <code>v_book.author_id</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.VBookRecord, java.lang.Integer> AUTHOR_ID = createField("author_id", org.jooq.impl.SQLDataType.INTEGER, V_BOOK);

	/**
	 * The column <code>v_book.co_author_id</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.VBookRecord, java.lang.Integer> CO_AUTHOR_ID = createField("co_author_id", org.jooq.impl.SQLDataType.INTEGER, V_BOOK);

	/**
	 * The column <code>v_book.details_id</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.VBookRecord, java.lang.Integer> DETAILS_ID = createField("details_id", org.jooq.impl.SQLDataType.INTEGER, V_BOOK);

	/**
	 * The column <code>v_book.title</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.VBookRecord, java.lang.String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR.length(400), V_BOOK);

	/**
	 * The column <code>v_book.published_in</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.VBookRecord, java.lang.Integer> PUBLISHED_IN = createField("published_in", org.jooq.impl.SQLDataType.INTEGER, V_BOOK);

	/**
	 * The column <code>v_book.language_id</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.VBookRecord, java.lang.Integer> LANGUAGE_ID = createField("language_id", org.jooq.impl.SQLDataType.INTEGER, V_BOOK);

	/**
	 * The column <code>v_book.content_text</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.VBookRecord, java.lang.String> CONTENT_TEXT = createField("content_text", org.jooq.impl.SQLDataType.CLOB, V_BOOK);

	/**
	 * The column <code>v_book.content_pdf</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.VBookRecord, byte[]> CONTENT_PDF = createField("content_pdf", org.jooq.impl.SQLDataType.BLOB, V_BOOK);

	/**
	 * The column <code>v_book.status</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.VBookRecord, org.jooq.test.cubrid.generatedclasses.enums.VBookStatus> STATUS = createField("status", org.jooq.util.cubrid.CUBRIDDataType.VARCHAR.asEnumDataType(org.jooq.test.cubrid.generatedclasses.enums.VBookStatus.class), V_BOOK);

	/**
	 * No further instances allowed
	 */
	private VBook() {
		super("v_book", org.jooq.test.cubrid.generatedclasses.DefaultSchema.DEFAULT_SCHEMA);
	}
}
