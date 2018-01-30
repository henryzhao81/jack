/**
 * Autogenerated by Jack
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.rapleaf.jack.test_project.database_1.query;

import java.util.Collection;

import com.rapleaf.jack.queries.AbstractDeleteBuilder;
import com.rapleaf.jack.queries.where_operators.IWhereOperator;
import com.rapleaf.jack.queries.where_operators.JackMatchers;
import com.rapleaf.jack.queries.WhereConstraint;
import com.rapleaf.jack.test_project.database_1.iface.ITestStorePersistence;
import com.rapleaf.jack.test_project.database_1.models.TestStore;


public class TestStoreDeleteBuilder extends AbstractDeleteBuilder<TestStore> {

  public TestStoreDeleteBuilder(ITestStorePersistence caller) {
    super(caller);
  }

  public TestStoreDeleteBuilder id(Long value) {
    addId(value);
    return this;
  }

  public TestStoreDeleteBuilder idIn(Collection<Long> values) {
    addIds(values);
    return this;
  }

  public TestStoreDeleteBuilder entryType(Integer value) {
    addWhereConstraint(new WhereConstraint<Integer>(TestStore._Fields.entry_type, JackMatchers.equalTo(value)));
    return this;
  }

  public TestStoreDeleteBuilder whereEntryType(IWhereOperator<Integer> operator) {
    addWhereConstraint(new WhereConstraint<Integer>(TestStore._Fields.entry_type, operator));
    return this;
  }

  public TestStoreDeleteBuilder entryScope(Long value) {
    addWhereConstraint(new WhereConstraint<Long>(TestStore._Fields.entry_scope, JackMatchers.equalTo(value)));
    return this;
  }

  public TestStoreDeleteBuilder whereEntryScope(IWhereOperator<Long> operator) {
    addWhereConstraint(new WhereConstraint<Long>(TestStore._Fields.entry_scope, operator));
    return this;
  }

  public TestStoreDeleteBuilder entryKey(String value) {
    addWhereConstraint(new WhereConstraint<String>(TestStore._Fields.entry_key, JackMatchers.equalTo(value)));
    return this;
  }

  public TestStoreDeleteBuilder whereEntryKey(IWhereOperator<String> operator) {
    addWhereConstraint(new WhereConstraint<String>(TestStore._Fields.entry_key, operator));
    return this;
  }

  public TestStoreDeleteBuilder entryValue(String value) {
    addWhereConstraint(new WhereConstraint<String>(TestStore._Fields.entry_value, JackMatchers.equalTo(value)));
    return this;
  }

  public TestStoreDeleteBuilder whereEntryValue(IWhereOperator<String> operator) {
    addWhereConstraint(new WhereConstraint<String>(TestStore._Fields.entry_value, operator));
    return this;
  }

  public TestStoreDeleteBuilder createdAt(Long value) {
    addWhereConstraint(new WhereConstraint<Long>(TestStore._Fields.created_at, JackMatchers.equalTo(value)));
    return this;
  }

  public TestStoreDeleteBuilder whereCreatedAt(IWhereOperator<Long> operator) {
    addWhereConstraint(new WhereConstraint<Long>(TestStore._Fields.created_at, operator));
    return this;
  }

  public TestStoreDeleteBuilder updatedAt(Long value) {
    addWhereConstraint(new WhereConstraint<Long>(TestStore._Fields.updated_at, JackMatchers.equalTo(value)));
    return this;
  }

  public TestStoreDeleteBuilder whereUpdatedAt(IWhereOperator<Long> operator) {
    addWhereConstraint(new WhereConstraint<Long>(TestStore._Fields.updated_at, operator));
    return this;
  }
}
