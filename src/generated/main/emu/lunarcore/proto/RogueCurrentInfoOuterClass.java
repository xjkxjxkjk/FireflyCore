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

public final class RogueCurrentInfoOuterClass {
  /**
   * Protobuf type {@code RogueCurrentInfo}
   */
  public static final class RogueCurrentInfo extends ProtoMessage<RogueCurrentInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional .RogueStatus status = 7;</code>
     */
    private int status;

    /**
     * <code>optional .RogueMiracleInfo rogue_miracle_info = 2;</code>
     */
    private final RogueMiracleInfoOuterClass.RogueMiracleInfo rogueMiracleInfo = RogueMiracleInfoOuterClass.RogueMiracleInfo.newInstance();

    /**
     * <code>optional .RogueAeon rogue_aeon_info = 3;</code>
     */
    private final RogueAeonOuterClass.RogueAeon rogueAeonInfo = RogueAeonOuterClass.RogueAeon.newInstance();

    /**
     * <code>optional .RogueCommonPendingAction pending_action = 8;</code>
     */
    private final RogueCommonPendingActionOuterClass.RogueCommonPendingAction pendingAction = RogueCommonPendingActionOuterClass.RogueCommonPendingAction.newInstance();

    /**
     * <code>optional .RogueMapInfo room_map = 9;</code>
     */
    private final RogueMapInfoOuterClass.RogueMapInfo roomMap = RogueMapInfoOuterClass.RogueMapInfo.newInstance();

    /**
     * <code>optional .RogueVirtualItemInfo rogue_virtual_item = 10;</code>
     */
    private final RogueVirtualItemInfoOuterClass.RogueVirtualItemInfo rogueVirtualItem = RogueVirtualItemInfoOuterClass.RogueVirtualItemInfo.newInstance();

    /**
     * <code>optional .RogueAvatarInfo rogue_avatar_info = 11;</code>
     */
    private final RogueAvatarInfoOuterClass.RogueAvatarInfo rogueAvatarInfo = RogueAvatarInfoOuterClass.RogueAvatarInfo.newInstance();

    /**
     * <code>optional .RogueBuffInfo rogue_buff_info = 14;</code>
     */
    private final RogueBuffInfoOuterClass.RogueBuffInfo rogueBuffInfo = RogueBuffInfoOuterClass.RogueBuffInfo.newInstance();

    private RogueCurrentInfo() {
    }

    /**
     * @return a new empty instance of {@code RogueCurrentInfo}
     */
    public static RogueCurrentInfo newInstance() {
      return new RogueCurrentInfo();
    }

    /**
     * <code>optional .RogueStatus status = 7;</code>
     * @return whether the status field is set
     */
    public boolean hasStatus() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional .RogueStatus status = 7;</code>
     * @return this
     */
    public RogueCurrentInfo clearStatus() {
      bitField0_ &= ~0x00000001;
      status = 0;
      return this;
    }

    /**
     * <code>optional .RogueStatus status = 7;</code>
     * @return the status
     */
    public RogueStatusOuterClass.RogueStatus getStatus() {
      return RogueStatusOuterClass.RogueStatus.forNumber(status);
    }

    /**
     * Gets the value of the internal enum store. The result is
     * equivalent to {@link RogueCurrentInfo#getStatus()}.getNumber().
     *
     * @return numeric wire representation
     */
    public int getStatusValue() {
      return status;
    }

    /**
     * Sets the value of the internal enum store. This does not
     * do any validity checks, so be sure to use appropriate value
     * constants from {@link RogueStatusOuterClass.RogueStatus}. Setting an invalid value
     * can cause {@link RogueCurrentInfo#getStatus()} to return null
     *
     * @param value the numeric wire value to set
     * @return this
     */
    public RogueCurrentInfo setStatusValue(final int value) {
      bitField0_ |= 0x00000001;
      status = value;
      return this;
    }

    /**
     * <code>optional .RogueStatus status = 7;</code>
     * @param value the status to set
     * @return this
     */
    public RogueCurrentInfo setStatus(final RogueStatusOuterClass.RogueStatus value) {
      bitField0_ |= 0x00000001;
      status = value.getNumber();
      return this;
    }

    /**
     * <code>optional .RogueMiracleInfo rogue_miracle_info = 2;</code>
     * @return whether the rogueMiracleInfo field is set
     */
    public boolean hasRogueMiracleInfo() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional .RogueMiracleInfo rogue_miracle_info = 2;</code>
     * @return this
     */
    public RogueCurrentInfo clearRogueMiracleInfo() {
      bitField0_ &= ~0x00000002;
      rogueMiracleInfo.clear();
      return this;
    }

    /**
     * <code>optional .RogueMiracleInfo rogue_miracle_info = 2;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableRogueMiracleInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueMiracleInfoOuterClass.RogueMiracleInfo getRogueMiracleInfo() {
      return rogueMiracleInfo;
    }

    /**
     * <code>optional .RogueMiracleInfo rogue_miracle_info = 2;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueMiracleInfoOuterClass.RogueMiracleInfo getMutableRogueMiracleInfo() {
      bitField0_ |= 0x00000002;
      return rogueMiracleInfo;
    }

    /**
     * <code>optional .RogueMiracleInfo rogue_miracle_info = 2;</code>
     * @param value the rogueMiracleInfo to set
     * @return this
     */
    public RogueCurrentInfo setRogueMiracleInfo(
        final RogueMiracleInfoOuterClass.RogueMiracleInfo value) {
      bitField0_ |= 0x00000002;
      rogueMiracleInfo.copyFrom(value);
      return this;
    }

    /**
     * <code>optional .RogueAeon rogue_aeon_info = 3;</code>
     * @return whether the rogueAeonInfo field is set
     */
    public boolean hasRogueAeonInfo() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional .RogueAeon rogue_aeon_info = 3;</code>
     * @return this
     */
    public RogueCurrentInfo clearRogueAeonInfo() {
      bitField0_ &= ~0x00000004;
      rogueAeonInfo.clear();
      return this;
    }

    /**
     * <code>optional .RogueAeon rogue_aeon_info = 3;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableRogueAeonInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueAeonOuterClass.RogueAeon getRogueAeonInfo() {
      return rogueAeonInfo;
    }

    /**
     * <code>optional .RogueAeon rogue_aeon_info = 3;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueAeonOuterClass.RogueAeon getMutableRogueAeonInfo() {
      bitField0_ |= 0x00000004;
      return rogueAeonInfo;
    }

    /**
     * <code>optional .RogueAeon rogue_aeon_info = 3;</code>
     * @param value the rogueAeonInfo to set
     * @return this
     */
    public RogueCurrentInfo setRogueAeonInfo(final RogueAeonOuterClass.RogueAeon value) {
      bitField0_ |= 0x00000004;
      rogueAeonInfo.copyFrom(value);
      return this;
    }

    /**
     * <code>optional .RogueCommonPendingAction pending_action = 8;</code>
     * @return whether the pendingAction field is set
     */
    public boolean hasPendingAction() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional .RogueCommonPendingAction pending_action = 8;</code>
     * @return this
     */
    public RogueCurrentInfo clearPendingAction() {
      bitField0_ &= ~0x00000008;
      pendingAction.clear();
      return this;
    }

    /**
     * <code>optional .RogueCommonPendingAction pending_action = 8;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutablePendingAction()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueCommonPendingActionOuterClass.RogueCommonPendingAction getPendingAction() {
      return pendingAction;
    }

    /**
     * <code>optional .RogueCommonPendingAction pending_action = 8;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueCommonPendingActionOuterClass.RogueCommonPendingAction getMutablePendingAction() {
      bitField0_ |= 0x00000008;
      return pendingAction;
    }

    /**
     * <code>optional .RogueCommonPendingAction pending_action = 8;</code>
     * @param value the pendingAction to set
     * @return this
     */
    public RogueCurrentInfo setPendingAction(
        final RogueCommonPendingActionOuterClass.RogueCommonPendingAction value) {
      bitField0_ |= 0x00000008;
      pendingAction.copyFrom(value);
      return this;
    }

    /**
     * <code>optional .RogueMapInfo room_map = 9;</code>
     * @return whether the roomMap field is set
     */
    public boolean hasRoomMap() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>optional .RogueMapInfo room_map = 9;</code>
     * @return this
     */
    public RogueCurrentInfo clearRoomMap() {
      bitField0_ &= ~0x00000010;
      roomMap.clear();
      return this;
    }

    /**
     * <code>optional .RogueMapInfo room_map = 9;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableRoomMap()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueMapInfoOuterClass.RogueMapInfo getRoomMap() {
      return roomMap;
    }

    /**
     * <code>optional .RogueMapInfo room_map = 9;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueMapInfoOuterClass.RogueMapInfo getMutableRoomMap() {
      bitField0_ |= 0x00000010;
      return roomMap;
    }

    /**
     * <code>optional .RogueMapInfo room_map = 9;</code>
     * @param value the roomMap to set
     * @return this
     */
    public RogueCurrentInfo setRoomMap(final RogueMapInfoOuterClass.RogueMapInfo value) {
      bitField0_ |= 0x00000010;
      roomMap.copyFrom(value);
      return this;
    }

    /**
     * <code>optional .RogueVirtualItemInfo rogue_virtual_item = 10;</code>
     * @return whether the rogueVirtualItem field is set
     */
    public boolean hasRogueVirtualItem() {
      return (bitField0_ & 0x00000020) != 0;
    }

    /**
     * <code>optional .RogueVirtualItemInfo rogue_virtual_item = 10;</code>
     * @return this
     */
    public RogueCurrentInfo clearRogueVirtualItem() {
      bitField0_ &= ~0x00000020;
      rogueVirtualItem.clear();
      return this;
    }

    /**
     * <code>optional .RogueVirtualItemInfo rogue_virtual_item = 10;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableRogueVirtualItem()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueVirtualItemInfoOuterClass.RogueVirtualItemInfo getRogueVirtualItem() {
      return rogueVirtualItem;
    }

    /**
     * <code>optional .RogueVirtualItemInfo rogue_virtual_item = 10;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueVirtualItemInfoOuterClass.RogueVirtualItemInfo getMutableRogueVirtualItem() {
      bitField0_ |= 0x00000020;
      return rogueVirtualItem;
    }

    /**
     * <code>optional .RogueVirtualItemInfo rogue_virtual_item = 10;</code>
     * @param value the rogueVirtualItem to set
     * @return this
     */
    public RogueCurrentInfo setRogueVirtualItem(
        final RogueVirtualItemInfoOuterClass.RogueVirtualItemInfo value) {
      bitField0_ |= 0x00000020;
      rogueVirtualItem.copyFrom(value);
      return this;
    }

    /**
     * <code>optional .RogueAvatarInfo rogue_avatar_info = 11;</code>
     * @return whether the rogueAvatarInfo field is set
     */
    public boolean hasRogueAvatarInfo() {
      return (bitField0_ & 0x00000040) != 0;
    }

    /**
     * <code>optional .RogueAvatarInfo rogue_avatar_info = 11;</code>
     * @return this
     */
    public RogueCurrentInfo clearRogueAvatarInfo() {
      bitField0_ &= ~0x00000040;
      rogueAvatarInfo.clear();
      return this;
    }

    /**
     * <code>optional .RogueAvatarInfo rogue_avatar_info = 11;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableRogueAvatarInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueAvatarInfoOuterClass.RogueAvatarInfo getRogueAvatarInfo() {
      return rogueAvatarInfo;
    }

    /**
     * <code>optional .RogueAvatarInfo rogue_avatar_info = 11;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueAvatarInfoOuterClass.RogueAvatarInfo getMutableRogueAvatarInfo() {
      bitField0_ |= 0x00000040;
      return rogueAvatarInfo;
    }

    /**
     * <code>optional .RogueAvatarInfo rogue_avatar_info = 11;</code>
     * @param value the rogueAvatarInfo to set
     * @return this
     */
    public RogueCurrentInfo setRogueAvatarInfo(
        final RogueAvatarInfoOuterClass.RogueAvatarInfo value) {
      bitField0_ |= 0x00000040;
      rogueAvatarInfo.copyFrom(value);
      return this;
    }

    /**
     * <code>optional .RogueBuffInfo rogue_buff_info = 14;</code>
     * @return whether the rogueBuffInfo field is set
     */
    public boolean hasRogueBuffInfo() {
      return (bitField0_ & 0x00000080) != 0;
    }

    /**
     * <code>optional .RogueBuffInfo rogue_buff_info = 14;</code>
     * @return this
     */
    public RogueCurrentInfo clearRogueBuffInfo() {
      bitField0_ &= ~0x00000080;
      rogueBuffInfo.clear();
      return this;
    }

    /**
     * <code>optional .RogueBuffInfo rogue_buff_info = 14;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableRogueBuffInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueBuffInfoOuterClass.RogueBuffInfo getRogueBuffInfo() {
      return rogueBuffInfo;
    }

    /**
     * <code>optional .RogueBuffInfo rogue_buff_info = 14;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueBuffInfoOuterClass.RogueBuffInfo getMutableRogueBuffInfo() {
      bitField0_ |= 0x00000080;
      return rogueBuffInfo;
    }

    /**
     * <code>optional .RogueBuffInfo rogue_buff_info = 14;</code>
     * @param value the rogueBuffInfo to set
     * @return this
     */
    public RogueCurrentInfo setRogueBuffInfo(final RogueBuffInfoOuterClass.RogueBuffInfo value) {
      bitField0_ |= 0x00000080;
      rogueBuffInfo.copyFrom(value);
      return this;
    }

    @Override
    public RogueCurrentInfo copyFrom(final RogueCurrentInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        status = other.status;
        rogueMiracleInfo.copyFrom(other.rogueMiracleInfo);
        rogueAeonInfo.copyFrom(other.rogueAeonInfo);
        pendingAction.copyFrom(other.pendingAction);
        roomMap.copyFrom(other.roomMap);
        rogueVirtualItem.copyFrom(other.rogueVirtualItem);
        rogueAvatarInfo.copyFrom(other.rogueAvatarInfo);
        rogueBuffInfo.copyFrom(other.rogueBuffInfo);
      }
      return this;
    }

    @Override
    public RogueCurrentInfo mergeFrom(final RogueCurrentInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasStatus()) {
        setStatusValue(other.status);
      }
      if (other.hasRogueMiracleInfo()) {
        getMutableRogueMiracleInfo().mergeFrom(other.rogueMiracleInfo);
      }
      if (other.hasRogueAeonInfo()) {
        getMutableRogueAeonInfo().mergeFrom(other.rogueAeonInfo);
      }
      if (other.hasPendingAction()) {
        getMutablePendingAction().mergeFrom(other.pendingAction);
      }
      if (other.hasRoomMap()) {
        getMutableRoomMap().mergeFrom(other.roomMap);
      }
      if (other.hasRogueVirtualItem()) {
        getMutableRogueVirtualItem().mergeFrom(other.rogueVirtualItem);
      }
      if (other.hasRogueAvatarInfo()) {
        getMutableRogueAvatarInfo().mergeFrom(other.rogueAvatarInfo);
      }
      if (other.hasRogueBuffInfo()) {
        getMutableRogueBuffInfo().mergeFrom(other.rogueBuffInfo);
      }
      return this;
    }

    @Override
    public RogueCurrentInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      status = 0;
      rogueMiracleInfo.clear();
      rogueAeonInfo.clear();
      pendingAction.clear();
      roomMap.clear();
      rogueVirtualItem.clear();
      rogueAvatarInfo.clear();
      rogueBuffInfo.clear();
      return this;
    }

    @Override
    public RogueCurrentInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      rogueMiracleInfo.clearQuick();
      rogueAeonInfo.clearQuick();
      pendingAction.clearQuick();
      roomMap.clearQuick();
      rogueVirtualItem.clearQuick();
      rogueAvatarInfo.clearQuick();
      rogueBuffInfo.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof RogueCurrentInfo)) {
        return false;
      }
      RogueCurrentInfo other = (RogueCurrentInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasStatus() || status == other.status)
        && (!hasRogueMiracleInfo() || rogueMiracleInfo.equals(other.rogueMiracleInfo))
        && (!hasRogueAeonInfo() || rogueAeonInfo.equals(other.rogueAeonInfo))
        && (!hasPendingAction() || pendingAction.equals(other.pendingAction))
        && (!hasRoomMap() || roomMap.equals(other.roomMap))
        && (!hasRogueVirtualItem() || rogueVirtualItem.equals(other.rogueVirtualItem))
        && (!hasRogueAvatarInfo() || rogueAvatarInfo.equals(other.rogueAvatarInfo))
        && (!hasRogueBuffInfo() || rogueBuffInfo.equals(other.rogueBuffInfo));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 56);
        output.writeEnumNoTag(status);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 18);
        output.writeMessageNoTag(rogueMiracleInfo);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 26);
        output.writeMessageNoTag(rogueAeonInfo);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 66);
        output.writeMessageNoTag(pendingAction);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawByte((byte) 74);
        output.writeMessageNoTag(roomMap);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeRawByte((byte) 82);
        output.writeMessageNoTag(rogueVirtualItem);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeRawByte((byte) 90);
        output.writeMessageNoTag(rogueAvatarInfo);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        output.writeRawByte((byte) 114);
        output.writeMessageNoTag(rogueBuffInfo);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeEnumSizeNoTag(status);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(rogueMiracleInfo);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(rogueAeonInfo);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(pendingAction);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(roomMap);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(rogueVirtualItem);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(rogueAvatarInfo);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(rogueBuffInfo);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public RogueCurrentInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 56: {
            // status
            final int value = input.readInt32();
            if (RogueStatusOuterClass.RogueStatus.forNumber(value) != null) {
              status = value;
              bitField0_ |= 0x00000001;
            }
            tag = input.readTag();
            if (tag != 18) {
              break;
            }
          }
          case 18: {
            // rogueMiracleInfo
            input.readMessage(rogueMiracleInfo);
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 26) {
              break;
            }
          }
          case 26: {
            // rogueAeonInfo
            input.readMessage(rogueAeonInfo);
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 66) {
              break;
            }
          }
          case 66: {
            // pendingAction
            input.readMessage(pendingAction);
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 74) {
              break;
            }
          }
          case 74: {
            // roomMap
            input.readMessage(roomMap);
            bitField0_ |= 0x00000010;
            tag = input.readTag();
            if (tag != 82) {
              break;
            }
          }
          case 82: {
            // rogueVirtualItem
            input.readMessage(rogueVirtualItem);
            bitField0_ |= 0x00000020;
            tag = input.readTag();
            if (tag != 90) {
              break;
            }
          }
          case 90: {
            // rogueAvatarInfo
            input.readMessage(rogueAvatarInfo);
            bitField0_ |= 0x00000040;
            tag = input.readTag();
            if (tag != 114) {
              break;
            }
          }
          case 114: {
            // rogueBuffInfo
            input.readMessage(rogueBuffInfo);
            bitField0_ |= 0x00000080;
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
        output.writeEnum(FieldNames.status, status, RogueStatusOuterClass.RogueStatus.converter());
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeMessage(FieldNames.rogueMiracleInfo, rogueMiracleInfo);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeMessage(FieldNames.rogueAeonInfo, rogueAeonInfo);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeMessage(FieldNames.pendingAction, pendingAction);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeMessage(FieldNames.roomMap, roomMap);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeMessage(FieldNames.rogueVirtualItem, rogueVirtualItem);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeMessage(FieldNames.rogueAvatarInfo, rogueAvatarInfo);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        output.writeMessage(FieldNames.rogueBuffInfo, rogueBuffInfo);
      }
      output.endObject();
    }

    @Override
    public RogueCurrentInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -892481550: {
            if (input.isAtField(FieldNames.status)) {
              if (!input.trySkipNullValue()) {
                final RogueStatusOuterClass.RogueStatus value = input.readEnum(RogueStatusOuterClass.RogueStatus.converter());
                if (value != null) {
                  status = value.getNumber();
                  bitField0_ |= 0x00000001;
                } else {
                  input.skipUnknownEnumValue();
                }
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -452511099:
          case 1925436929: {
            if (input.isAtField(FieldNames.rogueMiracleInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(rogueMiracleInfo);
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1685018549:
          case -1375922619: {
            if (input.isAtField(FieldNames.rogueAeonInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(rogueAeonInfo);
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -110680403:
          case 1646545374: {
            if (input.isAtField(FieldNames.pendingAction)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(pendingAction);
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1379875457:
          case -172986376: {
            if (input.isAtField(FieldNames.roomMap)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(roomMap);
                bitField0_ |= 0x00000010;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 2090167940:
          case -856063476: {
            if (input.isAtField(FieldNames.rogueVirtualItem)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(rogueVirtualItem);
                bitField0_ |= 0x00000020;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1966631135:
          case 667955439: {
            if (input.isAtField(FieldNames.rogueAvatarInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(rogueAvatarInfo);
                bitField0_ |= 0x00000040;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1107898267:
          case -694847243: {
            if (input.isAtField(FieldNames.rogueBuffInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(rogueBuffInfo);
                bitField0_ |= 0x00000080;
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
    public RogueCurrentInfo clone() {
      return new RogueCurrentInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static RogueCurrentInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new RogueCurrentInfo(), data).checkInitialized();
    }

    public static RogueCurrentInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueCurrentInfo(), input).checkInitialized();
    }

    public static RogueCurrentInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueCurrentInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating RogueCurrentInfo messages
     */
    public static MessageFactory<RogueCurrentInfo> getFactory() {
      return RogueCurrentInfoFactory.INSTANCE;
    }

    private enum RogueCurrentInfoFactory implements MessageFactory<RogueCurrentInfo> {
      INSTANCE;

      @Override
      public RogueCurrentInfo create() {
        return RogueCurrentInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName status = FieldName.forField("status");

      static final FieldName rogueMiracleInfo = FieldName.forField("rogueMiracleInfo", "rogue_miracle_info");

      static final FieldName rogueAeonInfo = FieldName.forField("rogueAeonInfo", "rogue_aeon_info");

      static final FieldName pendingAction = FieldName.forField("pendingAction", "pending_action");

      static final FieldName roomMap = FieldName.forField("roomMap", "room_map");

      static final FieldName rogueVirtualItem = FieldName.forField("rogueVirtualItem", "rogue_virtual_item");

      static final FieldName rogueAvatarInfo = FieldName.forField("rogueAvatarInfo", "rogue_avatar_info");

      static final FieldName rogueBuffInfo = FieldName.forField("rogueBuffInfo", "rogue_buff_info");
    }
  }
}