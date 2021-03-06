// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/containeranalysis/v1beta1/grafeas/grafeas.proto

package io.grafeas.v1beta1;

public interface ListNoteOccurrencesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1beta1.ListNoteOccurrencesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the note to list occurrences for in the form of
   * `projects/[PROVIDER_ID]/notes/[NOTE_ID]`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the note to list occurrences for in the form of
   * `projects/[PROVIDER_ID]/notes/[NOTE_ID]`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The filter expression.
   * </pre>
   *
   * <code>string filter = 2;</code>
   */
  java.lang.String getFilter();
  /**
   * <pre>
   * The filter expression.
   * </pre>
   *
   * <code>string filter = 2;</code>
   */
  com.google.protobuf.ByteString
      getFilterBytes();

  /**
   * <pre>
   * Number of occurrences to return in the list.
   * </pre>
   *
   * <code>int32 page_size = 3;</code>
   */
  int getPageSize();

  /**
   * <pre>
   * Token to provide to skip to a particular spot in the list.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * Token to provide to skip to a particular spot in the list.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
