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

public final class ActivityScheduleInfoOuterClass {
  /**
   * Protobuf type {@code ActivityScheduleInfo}
   */
  public static final class ActivityScheduleInfo extends ProtoMessage<ActivityScheduleInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional int64 end_time = 7;</code>
     */
    private long endTime;

    /**
     * <code>optional int64 begin_time = 13;</code>
     */
    private long beginTime;

    /**
     * <pre>
     *  OCCGBNFONLK
     * </pre>
     *
     * <code>optional uint32 activity_id = 6;</code>
     */
    private int activityId;

    /**
     * <pre>
     *  FFOJAFCKMOE
     * </pre>
     *
     * <code>optional uint32 module_id = 9;</code>
     */
    private int moduleId;

    private ActivityScheduleInfo() {
    }

    /**
     * @return a new empty instance of {@code ActivityScheduleInfo}
     */
    public static ActivityScheduleInfo newInstance() {
      return new ActivityScheduleInfo();
    }

    /**
     * <code>optional int64 end_time = 7;</code>
     * @return whether the endTime field is set
     */
    public boolean hasEndTime() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional int64 end_time = 7;</code>
     * @return this
     */
    public ActivityScheduleInfo clearEndTime() {
      bitField0_ &= ~0x00000001;
      endTime = 0L;
      return this;
    }

    /**
     * <code>optional int64 end_time = 7;</code>
     * @return the endTime
     */
    public long getEndTime() {
      return endTime;
    }

    /**
     * <code>optional int64 end_time = 7;</code>
     * @param value the endTime to set
     * @return this
     */
    public ActivityScheduleInfo setEndTime(final long value) {
      bitField0_ |= 0x00000001;
      endTime = value;
      return this;
    }

    /**
     * <code>optional int64 begin_time = 13;</code>
     * @return whether the beginTime field is set
     */
    public boolean hasBeginTime() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional int64 begin_time = 13;</code>
     * @return this
     */
    public ActivityScheduleInfo clearBeginTime() {
      bitField0_ &= ~0x00000002;
      beginTime = 0L;
      return this;
    }

    /**
     * <code>optional int64 begin_time = 13;</code>
     * @return the beginTime
     */
    public long getBeginTime() {
      return beginTime;
    }

    /**
     * <code>optional int64 begin_time = 13;</code>
     * @param value the beginTime to set
     * @return this
     */
    public ActivityScheduleInfo setBeginTime(final long value) {
      bitField0_ |= 0x00000002;
      beginTime = value;
      return this;
    }

    /**
     * <pre>
     *  OCCGBNFONLK
     * </pre>
     *
     * <code>optional uint32 activity_id = 6;</code>
     * @return whether the activityId field is set
     */
    public boolean hasActivityId() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <pre>
     *  OCCGBNFONLK
     * </pre>
     *
     * <code>optional uint32 activity_id = 6;</code>
     * @return this
     */
    public ActivityScheduleInfo clearActivityId() {
      bitField0_ &= ~0x00000004;
      activityId = 0;
      return this;
    }

    /**
     * <pre>
     *  OCCGBNFONLK
     * </pre>
     *
     * <code>optional uint32 activity_id = 6;</code>
     * @return the activityId
     */
    public int getActivityId() {
      return activityId;
    }

    /**
     * <pre>
     *  OCCGBNFONLK
     * </pre>
     *
     * <code>optional uint32 activity_id = 6;</code>
     * @param value the activityId to set
     * @return this
     */
    public ActivityScheduleInfo setActivityId(final int value) {
      bitField0_ |= 0x00000004;
      activityId = value;
      return this;
    }

    /**
     * <pre>
     *  FFOJAFCKMOE
     * </pre>
     *
     * <code>optional uint32 module_id = 9;</code>
     * @return whether the moduleId field is set
     */
    public boolean hasModuleId() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <pre>
     *  FFOJAFCKMOE
     * </pre>
     *
     * <code>optional uint32 module_id = 9;</code>
     * @return this
     */
    public ActivityScheduleInfo clearModuleId() {
      bitField0_ &= ~0x00000008;
      moduleId = 0;
      return this;
    }

    /**
     * <pre>
     *  FFOJAFCKMOE
     * </pre>
     *
     * <code>optional uint32 module_id = 9;</code>
     * @return the moduleId
     */
    public int getModuleId() {
      return moduleId;
    }

    /**
     * <pre>
     *  FFOJAFCKMOE
     * </pre>
     *
     * <code>optional uint32 module_id = 9;</code>
     * @param value the moduleId to set
     * @return this
     */
    public ActivityScheduleInfo setModuleId(final int value) {
      bitField0_ |= 0x00000008;
      moduleId = value;
      return this;
    }

    @Override
    public ActivityScheduleInfo copyFrom(final ActivityScheduleInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        endTime = other.endTime;
        beginTime = other.beginTime;
        activityId = other.activityId;
        moduleId = other.moduleId;
      }
      return this;
    }

    @Override
    public ActivityScheduleInfo mergeFrom(final ActivityScheduleInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasEndTime()) {
        setEndTime(other.endTime);
      }
      if (other.hasBeginTime()) {
        setBeginTime(other.beginTime);
      }
      if (other.hasActivityId()) {
        setActivityId(other.activityId);
      }
      if (other.hasModuleId()) {
        setModuleId(other.moduleId);
      }
      return this;
    }

    @Override
    public ActivityScheduleInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      endTime = 0L;
      beginTime = 0L;
      activityId = 0;
      moduleId = 0;
      return this;
    }

    @Override
    public ActivityScheduleInfo clearQuick() {
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
      if (!(o instanceof ActivityScheduleInfo)) {
        return false;
      }
      ActivityScheduleInfo other = (ActivityScheduleInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasEndTime() || endTime == other.endTime)
        && (!hasBeginTime() || beginTime == other.beginTime)
        && (!hasActivityId() || activityId == other.activityId)
        && (!hasModuleId() || moduleId == other.moduleId);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 56);
        output.writeInt64NoTag(endTime);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 104);
        output.writeInt64NoTag(beginTime);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 48);
        output.writeUInt32NoTag(activityId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 72);
        output.writeUInt32NoTag(moduleId);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeInt64SizeNoTag(endTime);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeInt64SizeNoTag(beginTime);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(activityId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(moduleId);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ActivityScheduleInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 56: {
            // endTime
            endTime = input.readInt64();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 104) {
              break;
            }
          }
          case 104: {
            // beginTime
            beginTime = input.readInt64();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 48) {
              break;
            }
          }
          case 48: {
            // activityId
            activityId = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 72) {
              break;
            }
          }
          case 72: {
            // moduleId
            moduleId = input.readUInt32();
            bitField0_ |= 0x00000008;
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
        output.writeInt64(FieldNames.endTime, endTime);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeInt64(FieldNames.beginTime, beginTime);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.activityId, activityId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeUInt32(FieldNames.moduleId, moduleId);
      }
      output.endObject();
    }

    @Override
    public ActivityScheduleInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1607243192:
          case 1725551537: {
            if (input.isAtField(FieldNames.endTime)) {
              if (!input.trySkipNullValue()) {
                endTime = input.readInt64();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1072839914:
          case 1112183971: {
            if (input.isAtField(FieldNames.beginTime)) {
              if (!input.trySkipNullValue()) {
                beginTime = input.readInt64();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 2048619658:
          case -917278645: {
            if (input.isAtField(FieldNames.activityId)) {
              if (!input.trySkipNullValue()) {
                activityId = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -604257113:
          case -1552079922: {
            if (input.isAtField(FieldNames.moduleId)) {
              if (!input.trySkipNullValue()) {
                moduleId = input.readUInt32();
                bitField0_ |= 0x00000008;
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
    public ActivityScheduleInfo clone() {
      return new ActivityScheduleInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ActivityScheduleInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ActivityScheduleInfo(), data).checkInitialized();
    }

    public static ActivityScheduleInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ActivityScheduleInfo(), input).checkInitialized();
    }

    public static ActivityScheduleInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ActivityScheduleInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating ActivityScheduleInfo messages
     */
    public static MessageFactory<ActivityScheduleInfo> getFactory() {
      return ActivityScheduleInfoFactory.INSTANCE;
    }

    private enum ActivityScheduleInfoFactory implements MessageFactory<ActivityScheduleInfo> {
      INSTANCE;

      @Override
      public ActivityScheduleInfo create() {
        return ActivityScheduleInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName endTime = FieldName.forField("endTime", "end_time");

      static final FieldName beginTime = FieldName.forField("beginTime", "begin_time");

      static final FieldName activityId = FieldName.forField("activityId", "activity_id");

      static final FieldName moduleId = FieldName.forField("moduleId", "module_id");
    }
  }
}
