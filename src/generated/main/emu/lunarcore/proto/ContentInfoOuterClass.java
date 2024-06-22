// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;

public final class ContentInfoOuterClass {
  /**
   * <pre>
   *  FIEDMJCNIKO
   * </pre>
   *
   * Protobuf type {@code ContentInfo}
   */
  public static final class ContentInfo extends ProtoMessage<ContentInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 map_entry_id = 8;</code>
     */
    private int mapEntryId;

    /**
     * <code>optional .ContentPackageStatus status = 7;</code>
     */
    private int status;

    private ContentInfo() {
    }

    /**
     * <pre>
     *  FIEDMJCNIKO
     * </pre>
     *
     * @return a new empty instance of {@code ContentInfo}
     */
    public static ContentInfo newInstance() {
      return new ContentInfo();
    }

    /**
     * <code>optional uint32 map_entry_id = 8;</code>
     * @return whether the mapEntryId field is set
     */
    public boolean hasMapEntryId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 map_entry_id = 8;</code>
     * @return this
     */
    public ContentInfo clearMapEntryId() {
      bitField0_ &= ~0x00000001;
      mapEntryId = 0;
      return this;
    }

    /**
     * <code>optional uint32 map_entry_id = 8;</code>
     * @return the mapEntryId
     */
    public int getMapEntryId() {
      return mapEntryId;
    }

    /**
     * <code>optional uint32 map_entry_id = 8;</code>
     * @param value the mapEntryId to set
     * @return this
     */
    public ContentInfo setMapEntryId(final int value) {
      bitField0_ |= 0x00000001;
      mapEntryId = value;
      return this;
    }

    /**
     * <code>optional .ContentPackageStatus status = 7;</code>
     * @return whether the status field is set
     */
    public boolean hasStatus() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional .ContentPackageStatus status = 7;</code>
     * @return this
     */
    public ContentInfo clearStatus() {
      bitField0_ &= ~0x00000002;
      status = 0;
      return this;
    }

    /**
     * <code>optional .ContentPackageStatus status = 7;</code>
     * @return the status
     */
    public ContentPackageStatusOuterClass.ContentPackageStatus getStatus() {
      return ContentPackageStatusOuterClass.ContentPackageStatus.forNumber(status);
    }

    /**
     * Gets the value of the internal enum store. The result is
     * equivalent to {@link ContentInfo#getStatus()}.getNumber().
     *
     * @return numeric wire representation
     */
    public int getStatusValue() {
      return status;
    }

    /**
     * Sets the value of the internal enum store. This does not
     * do any validity checks, so be sure to use appropriate value
     * constants from {@link ContentPackageStatusOuterClass.ContentPackageStatus}. Setting an invalid value
     * can cause {@link ContentInfo#getStatus()} to return null
     *
     * @param value the numeric wire value to set
     * @return this
     */
    public ContentInfo setStatusValue(final int value) {
      bitField0_ |= 0x00000002;
      status = value;
      return this;
    }

    /**
     * <code>optional .ContentPackageStatus status = 7;</code>
     * @param value the status to set
     * @return this
     */
    public ContentInfo setStatus(final ContentPackageStatusOuterClass.ContentPackageStatus value) {
      bitField0_ |= 0x00000002;
      status = value.getNumber();
      return this;
    }

    @Override
    public ContentInfo copyFrom(final ContentInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        mapEntryId = other.mapEntryId;
        status = other.status;
      }
      return this;
    }

    @Override
    public ContentInfo mergeFrom(final ContentInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasMapEntryId()) {
        setMapEntryId(other.mapEntryId);
      }
      if (other.hasStatus()) {
        setStatusValue(other.status);
      }
      return this;
    }

    @Override
    public ContentInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      mapEntryId = 0;
      status = 0;
      return this;
    }

    @Override
    public ContentInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof ContentInfo)) {
        return false;
      }
      ContentInfo other = (ContentInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasMapEntryId() || mapEntryId == other.mapEntryId)
        && (!hasStatus() || status == other.status);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 64);
        output.writeUInt32NoTag(mapEntryId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 56);
        output.writeEnumNoTag(status);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(mapEntryId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeEnumSizeNoTag(status);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ContentInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 64: {
            // mapEntryId
            mapEntryId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 56) {
              break;
            }
          }
          case 56: {
            // status
            final int value = input.readInt32();
            if (ContentPackageStatusOuterClass.ContentPackageStatus.forNumber(value) != null) {
              status = value;
              bitField0_ |= 0x00000002;
            }
            tag = input.readTag();
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.mapEntryId, mapEntryId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeEnum(FieldNames.status, status, ContentPackageStatusOuterClass.ContentPackageStatus.converter());
      }
      output.endObject();
    }

    @Override
    public ContentInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1475203023:
          case 436670347: {
            if (input.isAtField(FieldNames.mapEntryId)) {
              if (!input.trySkipNullValue()) {
                mapEntryId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -892481550: {
            if (input.isAtField(FieldNames.status)) {
              if (!input.trySkipNullValue()) {
                final ContentPackageStatusOuterClass.ContentPackageStatus value = input.readEnum(ContentPackageStatusOuterClass.ContentPackageStatus.converter());
                if (value != null) {
                  status = value.getNumber();
                  bitField0_ |= 0x00000002;
                } else {
                  input.skipUnknownEnumValue();
                }
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public ContentInfo clone() {
      return new ContentInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ContentInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ContentInfo(), data).checkInitialized();
    }

    public static ContentInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ContentInfo(), input).checkInitialized();
    }

    public static ContentInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ContentInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating ContentInfo messages
     */
    public static MessageFactory<ContentInfo> getFactory() {
      return ContentInfoFactory.INSTANCE;
    }

    private enum ContentInfoFactory implements MessageFactory<ContentInfo> {
      INSTANCE;

      @Override
      public ContentInfo create() {
        return ContentInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName mapEntryId = FieldName.forField("mapEntryId", "map_entry_id");

      static final FieldName status = FieldName.forField("status");
    }
  }
}
