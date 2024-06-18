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
import us.hebi.quickbuf.RepeatedInt;

public final class GetMissionStatusCsReqOuterClass {
  /**
   * Protobuf type {@code GetMissionStatusCsReq}
   */
  public static final class GetMissionStatusCsReq extends ProtoMessage<GetMissionStatusCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>repeated uint32 mission_event_id_list = 3;</code>
     */
    private final RepeatedInt missionEventIdList = RepeatedInt.newEmptyInstance();

    /**
     * <code>repeated uint32 main_mission_id_list = 4;</code>
     */
    private final RepeatedInt mainMissionIdList = RepeatedInt.newEmptyInstance();

    /**
     * <code>repeated uint32 sub_mission_id_list = 15;</code>
     */
    private final RepeatedInt subMissionIdList = RepeatedInt.newEmptyInstance();

    private GetMissionStatusCsReq() {
    }

    /**
     * @return a new empty instance of {@code GetMissionStatusCsReq}
     */
    public static GetMissionStatusCsReq newInstance() {
      return new GetMissionStatusCsReq();
    }

    /**
     * <code>repeated uint32 mission_event_id_list = 3;</code>
     * @return whether the missionEventIdList field is set
     */
    public boolean hasMissionEventIdList() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>repeated uint32 mission_event_id_list = 3;</code>
     * @return this
     */
    public GetMissionStatusCsReq clearMissionEventIdList() {
      bitField0_ &= ~0x00000001;
      missionEventIdList.clear();
      return this;
    }

    /**
     * <code>repeated uint32 mission_event_id_list = 3;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableMissionEventIdList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getMissionEventIdList() {
      return missionEventIdList;
    }

    /**
     * <code>repeated uint32 mission_event_id_list = 3;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableMissionEventIdList() {
      bitField0_ |= 0x00000001;
      return missionEventIdList;
    }

    /**
     * <code>repeated uint32 mission_event_id_list = 3;</code>
     * @param value the missionEventIdList to add
     * @return this
     */
    public GetMissionStatusCsReq addMissionEventIdList(final int value) {
      bitField0_ |= 0x00000001;
      missionEventIdList.add(value);
      return this;
    }

    /**
     * <code>repeated uint32 mission_event_id_list = 3;</code>
     * @param values the missionEventIdList to add
     * @return this
     */
    public GetMissionStatusCsReq addAllMissionEventIdList(final int... values) {
      bitField0_ |= 0x00000001;
      missionEventIdList.addAll(values);
      return this;
    }

    /**
     * <code>repeated uint32 main_mission_id_list = 4;</code>
     * @return whether the mainMissionIdList field is set
     */
    public boolean hasMainMissionIdList() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>repeated uint32 main_mission_id_list = 4;</code>
     * @return this
     */
    public GetMissionStatusCsReq clearMainMissionIdList() {
      bitField0_ &= ~0x00000002;
      mainMissionIdList.clear();
      return this;
    }

    /**
     * <code>repeated uint32 main_mission_id_list = 4;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableMainMissionIdList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getMainMissionIdList() {
      return mainMissionIdList;
    }

    /**
     * <code>repeated uint32 main_mission_id_list = 4;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableMainMissionIdList() {
      bitField0_ |= 0x00000002;
      return mainMissionIdList;
    }

    /**
     * <code>repeated uint32 main_mission_id_list = 4;</code>
     * @param value the mainMissionIdList to add
     * @return this
     */
    public GetMissionStatusCsReq addMainMissionIdList(final int value) {
      bitField0_ |= 0x00000002;
      mainMissionIdList.add(value);
      return this;
    }

    /**
     * <code>repeated uint32 main_mission_id_list = 4;</code>
     * @param values the mainMissionIdList to add
     * @return this
     */
    public GetMissionStatusCsReq addAllMainMissionIdList(final int... values) {
      bitField0_ |= 0x00000002;
      mainMissionIdList.addAll(values);
      return this;
    }

    /**
     * <code>repeated uint32 sub_mission_id_list = 15;</code>
     * @return whether the subMissionIdList field is set
     */
    public boolean hasSubMissionIdList() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>repeated uint32 sub_mission_id_list = 15;</code>
     * @return this
     */
    public GetMissionStatusCsReq clearSubMissionIdList() {
      bitField0_ &= ~0x00000004;
      subMissionIdList.clear();
      return this;
    }

    /**
     * <code>repeated uint32 sub_mission_id_list = 15;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableSubMissionIdList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getSubMissionIdList() {
      return subMissionIdList;
    }

    /**
     * <code>repeated uint32 sub_mission_id_list = 15;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableSubMissionIdList() {
      bitField0_ |= 0x00000004;
      return subMissionIdList;
    }

    /**
     * <code>repeated uint32 sub_mission_id_list = 15;</code>
     * @param value the subMissionIdList to add
     * @return this
     */
    public GetMissionStatusCsReq addSubMissionIdList(final int value) {
      bitField0_ |= 0x00000004;
      subMissionIdList.add(value);
      return this;
    }

    /**
     * <code>repeated uint32 sub_mission_id_list = 15;</code>
     * @param values the subMissionIdList to add
     * @return this
     */
    public GetMissionStatusCsReq addAllSubMissionIdList(final int... values) {
      bitField0_ |= 0x00000004;
      subMissionIdList.addAll(values);
      return this;
    }

    @Override
    public GetMissionStatusCsReq copyFrom(final GetMissionStatusCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        missionEventIdList.copyFrom(other.missionEventIdList);
        mainMissionIdList.copyFrom(other.mainMissionIdList);
        subMissionIdList.copyFrom(other.subMissionIdList);
      }
      return this;
    }

    @Override
    public GetMissionStatusCsReq mergeFrom(final GetMissionStatusCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasMissionEventIdList()) {
        getMutableMissionEventIdList().addAll(other.missionEventIdList);
      }
      if (other.hasMainMissionIdList()) {
        getMutableMainMissionIdList().addAll(other.mainMissionIdList);
      }
      if (other.hasSubMissionIdList()) {
        getMutableSubMissionIdList().addAll(other.subMissionIdList);
      }
      return this;
    }

    @Override
    public GetMissionStatusCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      missionEventIdList.clear();
      mainMissionIdList.clear();
      subMissionIdList.clear();
      return this;
    }

    @Override
    public GetMissionStatusCsReq clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      missionEventIdList.clear();
      mainMissionIdList.clear();
      subMissionIdList.clear();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GetMissionStatusCsReq)) {
        return false;
      }
      GetMissionStatusCsReq other = (GetMissionStatusCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasMissionEventIdList() || missionEventIdList.equals(other.missionEventIdList))
        && (!hasMainMissionIdList() || mainMissionIdList.equals(other.mainMissionIdList))
        && (!hasSubMissionIdList() || subMissionIdList.equals(other.subMissionIdList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        for (int i = 0; i < missionEventIdList.length(); i++) {
          output.writeRawByte((byte) 24);
          output.writeUInt32NoTag(missionEventIdList.array()[i]);
        }
      }
      if ((bitField0_ & 0x00000002) != 0) {
        for (int i = 0; i < mainMissionIdList.length(); i++) {
          output.writeRawByte((byte) 32);
          output.writeUInt32NoTag(mainMissionIdList.array()[i]);
        }
      }
      if ((bitField0_ & 0x00000004) != 0) {
        for (int i = 0; i < subMissionIdList.length(); i++) {
          output.writeRawByte((byte) 120);
          output.writeUInt32NoTag(subMissionIdList.array()[i]);
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += (1 * missionEventIdList.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(missionEventIdList);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += (1 * mainMissionIdList.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(mainMissionIdList);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += (1 * subMissionIdList.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(subMissionIdList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GetMissionStatusCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 26: {
            // missionEventIdList [packed=true]
            input.readPackedUInt32(missionEventIdList, tag);
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 34) {
              break;
            }
          }
          case 34: {
            // mainMissionIdList [packed=true]
            input.readPackedUInt32(mainMissionIdList, tag);
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 122) {
              break;
            }
          }
          case 122: {
            // subMissionIdList [packed=true]
            input.readPackedUInt32(subMissionIdList, tag);
            bitField0_ |= 0x00000004;
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
          case 24: {
            // missionEventIdList [packed=false]
            tag = input.readRepeatedUInt32(missionEventIdList, tag);
            bitField0_ |= 0x00000001;
            break;
          }
          case 32: {
            // mainMissionIdList [packed=false]
            tag = input.readRepeatedUInt32(mainMissionIdList, tag);
            bitField0_ |= 0x00000002;
            break;
          }
          case 120: {
            // subMissionIdList [packed=false]
            tag = input.readRepeatedUInt32(subMissionIdList, tag);
            bitField0_ |= 0x00000004;
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRepeatedUInt32(FieldNames.missionEventIdList, missionEventIdList);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRepeatedUInt32(FieldNames.mainMissionIdList, mainMissionIdList);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRepeatedUInt32(FieldNames.subMissionIdList, subMissionIdList);
      }
      output.endObject();
    }

    @Override
    public GetMissionStatusCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 784770663:
          case -628890838: {
            if (input.isAtField(FieldNames.missionEventIdList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(missionEventIdList);
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1438400460:
          case -1382679799: {
            if (input.isAtField(FieldNames.mainMissionIdList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(mainMissionIdList);
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 2039339685:
          case -225917552: {
            if (input.isAtField(FieldNames.subMissionIdList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(subMissionIdList);
                bitField0_ |= 0x00000004;
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
    public GetMissionStatusCsReq clone() {
      return new GetMissionStatusCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GetMissionStatusCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GetMissionStatusCsReq(), data).checkInitialized();
    }

    public static GetMissionStatusCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetMissionStatusCsReq(), input).checkInitialized();
    }

    public static GetMissionStatusCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetMissionStatusCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating GetMissionStatusCsReq messages
     */
    public static MessageFactory<GetMissionStatusCsReq> getFactory() {
      return GetMissionStatusCsReqFactory.INSTANCE;
    }

    private enum GetMissionStatusCsReqFactory implements MessageFactory<GetMissionStatusCsReq> {
      INSTANCE;

      @Override
      public GetMissionStatusCsReq create() {
        return GetMissionStatusCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName missionEventIdList = FieldName.forField("missionEventIdList", "mission_event_id_list");

      static final FieldName mainMissionIdList = FieldName.forField("mainMissionIdList", "main_mission_id_list");

      static final FieldName subMissionIdList = FieldName.forField("subMissionIdList", "sub_mission_id_list");
    }
  }
}