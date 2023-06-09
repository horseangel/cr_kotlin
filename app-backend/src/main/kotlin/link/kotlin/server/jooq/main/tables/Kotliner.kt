/*
 * This file is generated by jOOQ.
 */
package link.kotlin.server.jooq.main.tables


import java.util.function.Function

import kotlin.collections.List

import link.kotlin.server.jooq.main.Public
import link.kotlin.server.jooq.main.keys.KOTLINER_PKEY
import link.kotlin.server.jooq.main.keys.UNIQUE_KOTLINER_EMAIL
import link.kotlin.server.jooq.main.keys.UNIQUE_KOTLINER_NICKNAME
import link.kotlin.server.jooq.main.tables.records.KotlinerRecord

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Identity
import org.jooq.Name
import org.jooq.Record
import org.jooq.Records
import org.jooq.Row10
import org.jooq.Schema
import org.jooq.SelectField
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.UniqueKey
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class Kotliner(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, KotlinerRecord>?,
    aliased: Table<KotlinerRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<KotlinerRecord>(
    alias,
    Public.PUBLIC,
    child,
    path,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.table()
) {
    companion object {

        /**
         * The reference instance of <code>public.kotliner</code>
         */
        val KOTLINER: Kotliner = Kotliner()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<KotlinerRecord> = KotlinerRecord::class.java

    /**
     * The column <code>public.kotliner.id</code>.
     */
    val ID: TableField<KotlinerRecord, Long?> = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "")

    /**
     * The column <code>public.kotliner.avatar</code>.
     */
    val AVATAR: TableField<KotlinerRecord, String?> = createField(DSL.name("avatar"), SQLDataType.VARCHAR(500), this, "")

    /**
     * The column <code>public.kotliner.description</code>.
     */
    val DESCRIPTION: TableField<KotlinerRecord, String?> = createField(DSL.name("description"), SQLDataType.CLOB.nullable(false), this, "")

    /**
     * The column <code>public.kotliner.normalized_email</code>.
     */
    val NORMALIZED_EMAIL: TableField<KotlinerRecord, String?> = createField(DSL.name("normalized_email"), SQLDataType.VARCHAR(500).nullable(false), this, "")

    /**
     * The column <code>public.kotliner.original_email</code>.
     */
    val ORIGINAL_EMAIL: TableField<KotlinerRecord, String?> = createField(DSL.name("original_email"), SQLDataType.VARCHAR(500).nullable(false), this, "")

    /**
     * The column <code>public.kotliner.first_name</code>.
     */
    val FIRST_NAME: TableField<KotlinerRecord, String?> = createField(DSL.name("first_name"), SQLDataType.VARCHAR(100), this, "")

    /**
     * The column <code>public.kotliner.last_name</code>.
     */
    val LAST_NAME: TableField<KotlinerRecord, String?> = createField(DSL.name("last_name"), SQLDataType.VARCHAR(100), this, "")

    /**
     * The column <code>public.kotliner.nickname</code>.
     */
    val NICKNAME: TableField<KotlinerRecord, String?> = createField(DSL.name("nickname"), SQLDataType.VARCHAR(100).nullable(false), this, "")

    /**
     * The column <code>public.kotliner.password</code>.
     */
    val PASSWORD: TableField<KotlinerRecord, String?> = createField(DSL.name("password"), SQLDataType.VARCHAR(500).nullable(false), this, "")

    /**
     * The column <code>public.kotliner.totp</code>.
     */
    val TOTP: TableField<KotlinerRecord, String?> = createField(DSL.name("totp"), SQLDataType.VARCHAR(500), this, "")

    private constructor(alias: Name, aliased: Table<KotlinerRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<KotlinerRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.kotliner</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.kotliner</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.kotliner</code> table reference
     */
    constructor(): this(DSL.name("kotliner"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, KotlinerRecord>): this(Internal.createPathAlias(child, key), child, key, KOTLINER, null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getIdentity(): Identity<KotlinerRecord, Long?> = super.getIdentity() as Identity<KotlinerRecord, Long?>
    override fun getPrimaryKey(): UniqueKey<KotlinerRecord> = KOTLINER_PKEY
    override fun getUniqueKeys(): List<UniqueKey<KotlinerRecord>> = listOf(UNIQUE_KOTLINER_EMAIL, UNIQUE_KOTLINER_NICKNAME)
    override fun `as`(alias: String): Kotliner = Kotliner(DSL.name(alias), this)
    override fun `as`(alias: Name): Kotliner = Kotliner(alias, this)
    override fun `as`(alias: Table<*>): Kotliner = Kotliner(alias.getQualifiedName(), this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Kotliner = Kotliner(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Kotliner = Kotliner(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): Kotliner = Kotliner(name.getQualifiedName(), null)

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row10<Long?, String?, String?, String?, String?, String?, String?, String?, String?, String?> = super.fieldsRow() as Row10<Long?, String?, String?, String?, String?, String?, String?, String?, String?, String?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (Long?, String?, String?, String?, String?, String?, String?, String?, String?, String?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (Long?, String?, String?, String?, String?, String?, String?, String?, String?, String?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
