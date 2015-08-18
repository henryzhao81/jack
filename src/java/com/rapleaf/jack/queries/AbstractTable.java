package com.rapleaf.jack.queries;

import java.util.Set;

import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.collect.Sets;

import com.rapleaf.jack.AttributesWithId;
import com.rapleaf.jack.ModelWithId;

public class AbstractTable implements Table {
  protected final String name;
  protected final String alias;
  protected final Class<? extends AttributesWithId> attributeType;
  protected final Class<? extends ModelWithId> modelType;
  protected final Set<Column> allColumns;

  protected AbstractTable(String name, String alias, Class<? extends AttributesWithId> attributeType, Class<? extends ModelWithId> modelType) {
    Preconditions.checkArgument(!Strings.isNullOrEmpty(name), "Table name cannot be null or empty.");
    Preconditions.checkArgument(!Strings.isNullOrEmpty(alias), "Table alias cannot be null or empty.");
    this.name = name;
    this.alias = alias;
    this.attributeType = attributeType;
    this.modelType = modelType;
    this.allColumns = Sets.newHashSet();
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String getAlias() {
    return alias;
  }

  @Override
  public Set<Column> getAllColumns() {
    return allColumns;
  }

  @Override
  public String getSqlKeyword() {
    return name + " AS " + alias;
  }

  @Override
  public Class<? extends AttributesWithId> getAttributeType() {
    return attributeType;
  }

  @Override
  public Class<? extends ModelWithId> getModelType() {
    return modelType;
  }
}
