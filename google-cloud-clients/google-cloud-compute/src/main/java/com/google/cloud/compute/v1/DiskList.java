/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.compute.v1;

import com.google.api.core.BetaApi;
import com.google.api.gax.httpjson.ApiMessage;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("by GAPIC")
@BetaApi
public final class DiskList implements ApiMessage {
  private final String id;
  private final List<Disk> items;
  private final String kind;
  private final String nextPageToken;
  private final String selfLink;
  private final Warning warning;

  private DiskList() {
    this.id = null;
    this.items = null;
    this.kind = null;
    this.nextPageToken = null;
    this.selfLink = null;
    this.warning = null;
  }

  private DiskList(
      String id,
      List<Disk> items,
      String kind,
      String nextPageToken,
      String selfLink,
      Warning warning) {
    this.id = id;
    this.items = items;
    this.kind = kind;
    this.nextPageToken = nextPageToken;
    this.selfLink = selfLink;
    this.warning = warning;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if (fieldName.equals("id")) {
      return id;
    }
    if (fieldName.equals("items")) {
      return items;
    }
    if (fieldName.equals("kind")) {
      return kind;
    }
    if (fieldName.equals("nextPageToken")) {
      return nextPageToken;
    }
    if (fieldName.equals("selfLink")) {
      return selfLink;
    }
    if (fieldName.equals("warning")) {
      return warning;
    }
    return null;
  }

  @Nullable
  @Override
  public ApiMessage getApiMessageRequestBody() {
    return null;
  }

  @Nullable
  @Override
  public List<String> getFieldMask() {
    return null;
  }

  public String getId() {
    return id;
  }

  public List<Disk> getItemsList() {
    return items;
  }

  public String getKind() {
    return kind;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public String getSelfLink() {
    return selfLink;
  }

  public Warning getWarning() {
    return warning;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(DiskList prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static DiskList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final DiskList DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new DiskList();
  }

  public static class Builder {
    private String id;
    private List<Disk> items;
    private String kind;
    private String nextPageToken;
    private String selfLink;
    private Warning warning;

    Builder() {}

    public Builder mergeFrom(DiskList other) {
      if (other == DiskList.getDefaultInstance()) return this;
      if (other.getId() != null) {
        this.id = other.id;
      }
      if (other.getItemsList() != null) {
        this.items = other.items;
      }
      if (other.getKind() != null) {
        this.kind = other.kind;
      }
      if (other.getNextPageToken() != null) {
        this.nextPageToken = other.nextPageToken;
      }
      if (other.getSelfLink() != null) {
        this.selfLink = other.selfLink;
      }
      if (other.getWarning() != null) {
        this.warning = other.warning;
      }
      return this;
    }

    Builder(DiskList source) {
      this.id = source.id;
      this.items = source.items;
      this.kind = source.kind;
      this.nextPageToken = source.nextPageToken;
      this.selfLink = source.selfLink;
      this.warning = source.warning;
    }

    public String getId() {
      return id;
    }

    public Builder setId(String id) {
      this.id = id;
      return this;
    }

    public List<Disk> getItemsList() {
      return items;
    }

    public Builder addAllItems(List<Disk> items) {
      if (this.items == null) {
        this.items = new ArrayList<>(items.size());
      }
      this.items.addAll(items);
      return this;
    }

    public Builder addItems(Disk items) {
      this.items.add(items);
      return this;
    }

    public String getKind() {
      return kind;
    }

    public Builder setKind(String kind) {
      this.kind = kind;
      return this;
    }

    public String getNextPageToken() {
      return nextPageToken;
    }

    public Builder setNextPageToken(String nextPageToken) {
      this.nextPageToken = nextPageToken;
      return this;
    }

    public String getSelfLink() {
      return selfLink;
    }

    public Builder setSelfLink(String selfLink) {
      this.selfLink = selfLink;
      return this;
    }

    public Warning getWarning() {
      return warning;
    }

    public Builder setWarning(Warning warning) {
      this.warning = warning;
      return this;
    }

    public DiskList build() {

      return new DiskList(id, items, kind, nextPageToken, selfLink, warning);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setId(this.id);
      newBuilder.addAllItems(this.items);
      newBuilder.setKind(this.kind);
      newBuilder.setNextPageToken(this.nextPageToken);
      newBuilder.setSelfLink(this.selfLink);
      newBuilder.setWarning(this.warning);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "DiskList{"
        + "id="
        + id
        + ", "
        + "items="
        + items
        + ", "
        + "kind="
        + kind
        + ", "
        + "nextPageToken="
        + nextPageToken
        + ", "
        + "selfLink="
        + selfLink
        + ", "
        + "warning="
        + warning
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DiskList) {
      DiskList that = (DiskList) o;
      return Objects.equals(this.id, that.getId())
          && Objects.equals(this.items, that.getItemsList())
          && Objects.equals(this.kind, that.getKind())
          && Objects.equals(this.nextPageToken, that.getNextPageToken())
          && Objects.equals(this.selfLink, that.getSelfLink())
          && Objects.equals(this.warning, that.getWarning());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, items, kind, nextPageToken, selfLink, warning);
  }
}
