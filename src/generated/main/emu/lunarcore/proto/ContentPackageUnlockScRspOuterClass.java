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

public final class ContentPackageUnlockScRspOuterClass {
  /**
   * <pre>
   *  GIBNAGOFKPL
   * </pre>
   *
   * Protobuf type {@code ContentPackageUnlockScRsp}
   */
  public static final class ContentPackageUnlockScRsp extends ProtoMessage<ContentPackageUnlockScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 map_entry_id = 7;</code>
     */
    private int mapEntryId;

    /**
     * <code>optional uint32 retcode = 8;</code>
     */
    private int retcode;

    private ContentPackageUnlockScRsp() {
    }

    /**
     * <pre>
     *  GIBNAGOFKPL
     * </pre>
     *
     * @return a new empty instance of {@code ContentPackageUnlockScRsp}
     */
    public static ContentPackageUnlockScRsp newInstance() {
      return new ContentPackageUnlockScRsp();
    }

    /**
     * <code>optional uint32 map_entry_id = 7;</code>
     * @return whether the mapEntryId field is set
     */
    public boolean hasMapEntryId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 map_entry_id = 7;</code>
     * @return this
     */
    public ContentPackageUnlockScRsp clearMapEntryId() {
      bitField0_ &= ~0x00000001;
      mapEntryId = 0;
      return this;
    }

    /**
     * <code>optional uint32 map_entry_id = 7;</code>
     * @return the mapEntryId
     */
    public int getMapEntryId() {
      return mapEntryId;
    }

    /**
     * <code>optional uint32 map_entry_id = 7;</code>
     * @param value the mapEntryId to set
     * @return this
     */
    public ContentPackageUnlockScRsp setMapEntryId(final int value) {
      bitField0_ |= 0x00000001;
      mapEntryId = value;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 8;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 retcode = 8;</code>
     * @return this
     */
    public ContentPackageUnlockScRsp clearRetcode() {
      bitField0_ &= ~0x00000002;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 8;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 8;</code>
     * @param value the retcode to set
     * @return this
     */
    public ContentPackageUnlockScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000002;
      retcode = value;
      return this;
    }

    @Override
    public ContentPackageUnlockScRsp copyFrom(final ContentPackageUnlockScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        mapEntryId = other.mapEntryId;
        retcode = other.retcode;
      }
      return this;
    }

    @Override
    public ContentPackageUnlockScRsp mergeFrom(final ContentPackageUnlockScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasMapEntryId()) {
        setMapEntryId(other.mapEntryId);
      }
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      return this;
    }

    @Override
    public ContentPackageUnlockScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      mapEntryId = 0;
      retcode = 0;
      return this;
    }

    @Override
    public ContentPackageUnlockScRsp clearQuick() {
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
      if (!(o instanceof ContentPackageUnlockScRsp)) {
        return false;
      }
      ContentPackageUnlockScRsp other = (ContentPackageUnlockScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasMapEntryId() || mapEntryId == other.mapEntryId)
        && (!hasRetcode() || retcode == other.retcode);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 56);
        output.writeUInt32NoTag(mapEntryId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 64);
        output.writeUInt32NoTag(retcode);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(mapEntryId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ContentPackageUnlockScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 56: {
            // mapEntryId
            mapEntryId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 64) {
              break;
            }
          }
          case 64: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000002;
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
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      output.endObject();
    }

    @Override
    public ContentPackageUnlockScRsp mergeFrom(final JsonSource input) throws IOException {
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
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000002;
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
    public ContentPackageUnlockScRsp clone() {
      return new ContentPackageUnlockScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ContentPackageUnlockScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ContentPackageUnlockScRsp(), data).checkInitialized();
    }

    public static ContentPackageUnlockScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ContentPackageUnlockScRsp(), input).checkInitialized();
    }

    public static ContentPackageUnlockScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ContentPackageUnlockScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating ContentPackageUnlockScRsp messages
     */
    public static MessageFactory<ContentPackageUnlockScRsp> getFactory() {
      return ContentPackageUnlockScRspFactory.INSTANCE;
    }

    private enum ContentPackageUnlockScRspFactory implements MessageFactory<ContentPackageUnlockScRsp> {
      INSTANCE;

      @Override
      public ContentPackageUnlockScRsp create() {
        return ContentPackageUnlockScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName mapEntryId = FieldName.forField("mapEntryId", "map_entry_id");

      static final FieldName retcode = FieldName.forField("retcode");
    }
  }
}