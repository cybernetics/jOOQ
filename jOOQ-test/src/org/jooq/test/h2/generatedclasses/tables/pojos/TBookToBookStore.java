/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 *
 * An m:n relation between books and book stores
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBookToBookStore implements org.jooq.test.h2.generatedclasses.tables.interfaces.ITBookToBookStore {

	private static final long serialVersionUID = -1476911446;

	private java.lang.String  bookStoreName;
	private java.lang.Integer bookId;
	private java.lang.Integer stock;

	public TBookToBookStore() {}

	public TBookToBookStore(
		java.lang.String  bookStoreName,
		java.lang.Integer bookId,
		java.lang.Integer stock
	) {
		this.bookStoreName = bookStoreName;
		this.bookId = bookId;
		this.stock = stock;
	}

	@Override
	public java.lang.String getBookStoreName() {
		return this.bookStoreName;
	}

	@Override
	public TBookToBookStore setBookStoreName(java.lang.String bookStoreName) {
		this.bookStoreName = bookStoreName;
		return this;
	}

	@Override
	public java.lang.Integer getBookId() {
		return this.bookId;
	}

	@Override
	public TBookToBookStore setBookId(java.lang.Integer bookId) {
		this.bookId = bookId;
		return this;
	}

	@Override
	public java.lang.Integer getStock() {
		return this.stock;
	}

	@Override
	public TBookToBookStore setStock(java.lang.Integer stock) {
		this.stock = stock;
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.h2.generatedclasses.tables.interfaces.ITBookToBookStore from) {
		setBookStoreName(from.getBookStoreName());
		setBookId(from.getBookId());
		setStock(from.getStock());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.h2.generatedclasses.tables.interfaces.ITBookToBookStore> E into(E into) {
		into.from(this);
		return into;
	}
}
