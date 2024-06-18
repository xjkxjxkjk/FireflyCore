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

public final class FinishTutorialGuideCsReqOuterClass {
  /**
   * Protobuf type {@code FinishTutorialGuideCsReq}
   */
  public static final class FinishTutorialGuideCsReq extends ProtoMessage<FinishTutorialGuideCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 group_id = 10;</code>
     */
    private int groupId;

    private FinishTutorialGuideCsReq() {
    }

    /**
     * @return a new empty instance of {@code FinishTutorialGuideCsReq}
     */
    public static FinishTutorialGuideCsReq newInstance() {
      return new FinishTutorialGuideCsReq();
    }

    /**
     * <code>optional uint32 group_id = 10;</code>
     * @return whether the groupId field is set
     */
    public boolean hasGroupId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 group_id = 10;</code>
     * @return this
     */
    public FinishTutorialGuideCsReq clearGroupId() {
      bitField0_ &= ~0x00000001;
      groupId = 0;
      return this;
    }

    /**
     * <code>optional uint32 group_id = 10;</code>
     * @return the groupId
     */
    public int getGroupId() {
      return groupId;
    }

    /**
     * <code>optional uint32 group_id = 10;</code>
     * @param value the groupId to set
     * @return this
     */
    public FinishTutorialGuideCsReq setGroupId(final int value) {
      bitField0_ |= 0x00000001;
      groupId = value;
      return this;
    }

    @Override
    public FinishTutorialGuideCsReq copyFrom(final FinishTutorialGuideCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        groupId = other.groupId;
      }
      return this;
    }

    @Override
    public FinishTutorialGuideCsReq mergeFrom(final FinishTutorialGuideCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasGroupId()) {
        setGroupId(other.groupId);
      }
      return this;
    }

    @Override
    public FinishTutorialGuideCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      groupId = 0;
      return this;
    }

    @Override
    public FinishTutorialGuideCsReq clearQuick() {
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
      if (!(o instanceof FinishTutorialGuideCsReq)) {
        return false;
      }
      FinishTutorialGuideCsReq other = (FinishTutorialGuideCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasGroupId() || groupId == other.groupId);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(groupId);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(groupId);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public FinishTutorialGuideCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 80: {
            // groupId
            groupId = input.readUInt32();
            bitField0_ |= 0x00000001;
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
        output.writeUInt32(FieldNames.groupId, groupId);
      }
      output.endObject();
    }

    @Override
    public FinishTutorialGuideCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 293428218:
          case 506361563: {
            if (input.isAtField(FieldNames.groupId)) {
              if (!input.trySkipNullValue()) {
                groupId = input.readUInt32();
                bitField0_ |= 0x00000001;
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
    public FinishTutorialGuideCsReq clone() {
      return new FinishTutorialGuideCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static FinishTutorialGuideCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new FinishTutorialGuideCsReq(), data).checkInitialized();
    }

    public static FinishTutorialGuideCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new FinishTutorialGuideCsReq(), input).checkInitialized();
    }

    public static FinishTutorialGuideCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new FinishTutorialGuideCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating FinishTutorialGuideCsReq messages
     */
    public static MessageFactory<FinishTutorialGuideCsReq> getFactory() {
      return FinishTutorialGuideCsReqFactory.INSTANCE;
    }

    private enum FinishTutorialGuideCsReqFactory implements MessageFactory<FinishTutorialGuideCsReq> {
      INSTANCE;

      @Override
      public FinishTutorialGuideCsReq create() {
        return FinishTutorialGuideCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName groupId = FieldName.forField("groupId", "group_id");
    }
  }
}
