<template>
    <view class="content">
        <form class="app-update-pv">
                 <view
                         :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"100rpx"}'
                         class="cu-form-group">
                     <view :style='{"width":"160rpx","fontSize":"28rpx","color":"var(--publicMainColor)","textAlign":"left"}'
                           class="title">新冠抗原编号</view>
                     <input   disabled
                              :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"0","borderColor":"var(--publicMainColor)","backgroundColor":"#fff","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"0","borderWidth":"2rpx 2rpx 2rpx 8rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                              :disabled="ro.xinguankangyuanUuidNumber" v-model="xinguankangyuan.xinguankangyuanUuidNumber" placeholder="新冠抗原编号"></input>
                 </view>
                 <view
                         :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"100rpx"}'
                         class="cu-form-group">
                     <view :style='{"width":"160rpx","fontSize":"28rpx","color":"var(--publicMainColor)","textAlign":"left"}'
                           class="title">新冠抗原名称</view>
                     <input   disabled
                              :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"0","borderColor":"var(--publicMainColor)","backgroundColor":"#fff","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"0","borderWidth":"2rpx 2rpx 2rpx 8rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                              :disabled="ro.xinguankangyuanName" v-model="xinguankangyuan.xinguankangyuanName" placeholder="新冠抗原名称"></input>
                 </view>
                <view
                        :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(218, 220, 219, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"108rpx"}'
                        class="cu-form-group">
                    <view :style='{"width":"160rpx","fontSize":"28rpx","color":"var(--publicMainColor)","textAlign":"left"}'
                          class="title">新冠抗原照片</view>
                    <view class="right-input" style="padding:0;textAlign:left">
                        <image
                                :style='{"width":"68rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"68rpx"}'
                                class="avator" v-if="xinguankangyuan.xinguankangyuanPhoto" :src="baseUrl+xinguankangyuan.xinguankangyuanPhoto" mode="aspectFill">
                        </image>
                        <image
                                :style='{"width":"68rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"68rpx"}'
                                class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
                    </view>
                </view>
							                <view
                        :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"100rpx"}'
                        class="cu-form-group">
                    <view :style='{"width":"160rpx","fontSize":"28rpx","color":"var(--publicMainColor)","textAlign":"left"}'
                          class="title">新冠抗原类型</view>
                    <input disabled
                           :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"0","borderColor":"var(--publicMainColor)","backgroundColor":"#fff","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"0","borderWidth":"2rpx 2rpx 2rpx 8rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                           :disabled="ro.xinguankangyuanValue"
                           v-model="xinguankangyuan.xinguankangyuanValue"
                           placeholder="新冠抗原类型"></input>
                </view>
                 <view
                         :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"100rpx"}'
                         class="cu-form-group">
                     <view :style='{"width":"160rpx","fontSize":"28rpx","color":"var(--publicMainColor)","textAlign":"left"}'
                           class="title">新冠抗原库存</view>
                     <input   disabled
                              :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"0","borderColor":"var(--publicMainColor)","backgroundColor":"#fff","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"0","borderWidth":"2rpx 2rpx 2rpx 8rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                              :disabled="ro.xinguankangyuanKucunNumber" v-model="xinguankangyuan.xinguankangyuanKucunNumber" placeholder="新冠抗原库存"></input>
                 </view>
                <!--<view :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"100rpx"}'
                      class="cu-form-group">
                    <view :style='{"width":"160rpx","fontSize":"28rpx","color":"var(--publicMainColor)","textAlign":"left"}'
                          class="title">收货地址</view>
                    <picker @change="addressChange" :value="addressIndex" :range="addressOptions" range-key="addressName">
                        <view
                                :style='{"padding":"0 30rpx","boxShadow":"0 0 16rpx var(--publicSubColor) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"var(--publicMainColor)","borderRadius":"20rpx","color":"var(--publicMainColor)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                                class="uni-input">{{ruleForm.addressId?ruleForm.addressName:"请选择收货地址"}}</view>
                    </picker>
                </view>-->
                <!--<view :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"100rpx"}'
                      class="cu-form-group">
                    <view :style='{"width":"160rpx","fontSize":"28rpx","color":"var(--publicMainColor)","textAlign":"left"}'
                          class="title">新冠抗原</view>
                    <picker @change="xinguankangyuanChange" :value="xinguankangyuanIndex" :range="xinguankangyuanOptions" range-key="xinguankangyuanName">
                        <view
                                :style='{"padding":"0 30rpx","boxShadow":"0 0 16rpx var(--publicSubColor) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"var(--publicMainColor)","borderRadius":"20rpx","color":"var(--publicMainColor)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                                class="uni-input">{{ruleForm.xinguankangyuanId?ruleForm.xinguankangyuanName:"请选择新冠抗原"}}</view>
                    </picker>
                </view>-->
                <!--<view :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"100rpx"}'
                      class="cu-form-group">
                    <view :style='{"width":"160rpx","fontSize":"28rpx","color":"var(--publicMainColor)","textAlign":"left"}'
                          class="title">用户</view>
                    <picker @change="yonghuChange" :value="yonghuIndex" :range="yonghuOptions" range-key="yonghuName">
                        <view
                                :style='{"padding":"0 30rpx","boxShadow":"0 0 16rpx var(--publicSubColor) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"var(--publicMainColor)","borderRadius":"20rpx","color":"var(--publicMainColor)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                                class="uni-input">{{ruleForm.yonghuId?ruleForm.yonghuName:"请选择用户"}}</view>
                    </picker>
                </view>-->
            <view
                    :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"100rpx"}'
                    class="cu-form-group">
                <view :style='{"width":"160rpx","fontSize":"28rpx","color":"var(--publicMainColor)","textAlign":"left"}'
                      class="title">订单编号</view>
                <input   disabled
                         :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"0","borderColor":"var(--publicMainColor)","backgroundColor":"#fff","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"0","borderWidth":"2rpx 2rpx 2rpx 8rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                         :disabled="ro.xinguankangyuanOrderUuidNumber" type="text" v-model="ruleForm.xinguankangyuanOrderUuidNumber" placeholder="订单编号"></input>
            </view>
                <!-- 级联表的表id -->
                <input type="hidden" :value="xinguankangyuan.id" id="xinguankangyuanId" name="xinguankangyuanId"/>
                <view
                        :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"100rpx"}'
                        class="cu-form-group">
                    <view :style='{"width":"160rpx","fontSize":"28rpx","color":"var(--publicMainColor)","textAlign":"left"}'
                          class="title">购买数量</view>
                    <input   disabled
                             :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"0","borderColor":"var(--publicMainColor)","backgroundColor":"#fff","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"0","borderWidth":"2rpx 2rpx 2rpx 8rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                             :disabled="ro.buyNumber" type="number" v-model="ruleForm.buyNumber" placeholder="购买数量"></input>
                </view>
                <view :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"100rpx"}'
                      class="cu-form-group">
                    <view :style='{"width":"160rpx","fontSize":"28rpx","color":"var(--publicMainColor)","textAlign":"left"}'
                          class="title">订单类型</view>
                    <picker @change="xinguankangyuanOrderTypesChange" :value="xinguankangyuanOrderTypesIndex" :range="xinguankangyuanOrderTypesOptions" range-key="indexName">
                        <view
                                :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"0","borderColor":"var(--publicMainColor)","backgroundColor":"#fff","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"0","borderWidth":"2rpx 2rpx 2rpx 8rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                                class="uni-input">{{ruleForm.xinguankangyuanOrderTypes?ruleForm.xinguankangyuanOrderValue:"请选择订单类型"}}</view>
                    </picker>
                </view>

            <view class="btn">
                <button
                        :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,0) inset","backgroundColor":"var(--publicMainColor)","borderColor":"#409EFF","borderRadius":"8rpx","color":"rgba(255, 255, 255, 1)","borderWidth":"0","width":"70%","fontSize":"32rpx","borderStyle":"solid","height":"80rpx"}'
                        @tap="onSubmitTap" class="bg-red">提交</button>
            </view>
        </form>

					<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="insertTimeConfirm"
                              ref="insertTime" themeColor="#333333"></w-picker>
					<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="createTimeConfirm"
                              ref="createTime" themeColor="#333333"></w-picker>


    </view>
</template>

<script>
    import wPicker from "@/components/w-picker/w-picker.vue";

    export default {
        data() {
            return {
                cross: '',
                ro:{
					xinguankangyuanOrderUuidNumber: true,
					addressId: false,
					xinguankangyuanId: false,
					yonghuId: false,
					buyNumber: true,
					xinguankangyuanOrderTruePrice: false,
					xinguankangyuanOrderTypes: false,
					xinguankangyuanOrderPaymentTypes: false,
					insertTime: false,
					createTime: false,
        },
            ruleForm: {
					xinguankangyuanOrderUuidNumber: this.getUUID(),//数字
					addressId: '',
					xinguankangyuanId: '',
					yonghuId: '',
					buyNumber: '',
					xinguankangyuanOrderTruePrice: '',
					xinguankangyuanOrderTypes: '',//数字
					xinguankangyuanOrderValue: '',//数字对应的值
					xinguankangyuanOrderPaymentTypes: '',//数字
					xinguankangyuanOrderPaymentValue: '',//数字对应的值
					insertTime: '',
					createTime: '',
            },
            // 登陆用户信息
            user: {},
            xinguankangyuanOrderTypesOptions: [],
            xinguankangyuanOrderTypesIndex : 0,
            xinguankangyuanOrderPaymentTypesOptions: [],
            xinguankangyuanOrderPaymentTypesIndex : 0,
            addressOptions: [],//收货地址
            addressIndex : 0,//收货地址下标
            xinguankangyuanOptions: [],//新冠抗原
            xinguankangyuanIndex : 0,//新冠抗原下标
            yonghuOptions: [],//用户
            yonghuIndex : 0,//用户下标

        }
        },
        components: {
            wPicker
        },
        computed: {
            baseUrl() {
                return this.$base.url;
            },
        },
        async onLoad(options) {
            let addressParams = {
                page: 1,
                limit: 100,
            }
            let addressData = await this.$api.page(`address`, addressParams);
            this.addressOptions = addressData.data.list;
            let xinguankangyuanParams = {
                page: 1,
                limit: 100,
            }
            let xinguankangyuanData = await this.$api.page(`xinguankangyuan`, xinguankangyuanParams);
            this.xinguankangyuanOptions = xinguankangyuanData.data.list;
            let yonghuParams = {
                page: 1,
                limit: 100,
            }
            let yonghuData = await this.$api.page(`yonghu`, yonghuParams);
            this.yonghuOptions = yonghuData.data.list;
		/*下拉框*/
			let xinguankangyuanOrderTypesParams = {
                page: 1,
                limit: 100,
                dicCode: 'xinguankangyuan_order_types',
            }
			let xinguankangyuanOrderTypes = await this.$api.page(`dictionary`, xinguankangyuanOrderTypesParams);
			this.xinguankangyuanOrderTypesOptions = xinguankangyuanOrderTypes.data.list
		/*下拉框*/
			let xinguankangyuanOrderPaymentTypesParams = {
                page: 1,
                limit: 100,
                dicCode: 'xinguankangyuan_order_payment_types',
            }
			let xinguankangyuanOrderPaymentTypes = await this.$api.page(`dictionary`, xinguankangyuanOrderPaymentTypesParams);
			this.xinguankangyuanOrderPaymentTypesOptions = xinguankangyuanOrderPaymentTypes.data.list


            // 如果是更新操作
            if (options.id) {
                this.ruleForm.id = options.id;
                // 获取信息
                let res = await this.$api.info(`xinguankangyuanOrder`, this.ruleForm.id);
                this.ruleForm = res.data;
            }
            if(options.xinguankangyuanOrderId){
                this.ruleForm.xinguankangyuanOrderId = options.xinguankangyuanOrderId;
            }
            // 跨表
            // this.styleChange()
        },
        methods: {
            addressChange(e) {
                this.addressIndex = e.target.value
                this.ruleForm.addressName = this.addressOptions[this.addressIndex].addressName
                this.ruleForm.addressId = this.addressOptions[this.addressIndex].id
            },
            xinguankangyuanChange(e) {
                this.xinguankangyuanIndex = e.target.value
                this.ruleForm.xinguankangyuanName = this.xinguankangyuanOptions[this.xinguankangyuanIndex].xinguankangyuanName
                this.ruleForm.xinguankangyuanId = this.xinguankangyuanOptions[this.xinguankangyuanIndex].id
            },
            yonghuChange(e) {
                this.yonghuIndex = e.target.value
                this.ruleForm.yonghuName = this.yonghuOptions[this.yonghuIndex].yonghuName
                this.ruleForm.yonghuId = this.yonghuOptions[this.yonghuIndex].id
            },
            // 下拉变化
            xinguankangyuanOrderTypesChange(e) {
                this.xinguankangyuanOrderTypesIndex = e.target.value
                this.ruleForm.xinguankangyuanOrderValue = this.xinguankangyuanOrderTypesOptions[this.xinguankangyuanOrderTypesIndex].indexName
                this.ruleForm.xinguankangyuanOrderTypes = this.xinguankangyuanOrderTypesOptions[this.xinguankangyuanOrderTypesIndex].codeIndex
            },
            xinguankangyuanOrderPaymentTypesChange(e) {
                this.xinguankangyuanOrderPaymentTypesIndex = e.target.value
                this.ruleForm.xinguankangyuanOrderPaymentValue = this.xinguankangyuanOrderPaymentTypesOptions[this.xinguankangyuanOrderPaymentTypesIndex].indexName
                this.ruleForm.xinguankangyuanOrderPaymentTypes = this.xinguankangyuanOrderPaymentTypesOptions[this.xinguankangyuanOrderPaymentTypesIndex].codeIndex
            },
            // styleChange() {
            // 	this.$nextTick(() => {
            // 		// document.querySelectorAll('.app-update-pv .cu-form-group .uni-yaoxianStyle-yaoxianStyle').forEach(el=>{
            // 		//   el.style.backgroundColor = this.addUpdateForm.yaoxianStyle.content.backgroundColor
            // 		// })
            // 	})
            // },
			// 日期控件
			insertTimeConfirm(val) {
                this.ruleForm.insertTime = val.result;
                this.$forceUpdate();
            },
			// 日期控件
			createTimeConfirm(val) {
                this.ruleForm.createTime = val.result;
                this.$forceUpdate();
            },

            getUUID() {
                return new Date().getTime();
            },
            async onSubmitTap() {
				if ((!this.ruleForm.xinguankangyuanOrderUuidNumber)) {
                    this.$utils.msg(`订单编号不能为空`);
                    return
                }
				if ((!this.ruleForm.buyNumber) && (!this.$validate.isIntNumer(this.ruleForm.buyNumber)) && this.ruleForm.buyNumber >0) {
                    this.$utils.msg(`购买数量不能为空，不能小于0 格式为数字`);
                    return
                }
                if (this.ruleForm.id) {
                    await this.$api.update(`xinguankangyuanOrder`, this.ruleForm);
                } else {
                    await this.$api.save(`xinguankangyuanOrder`, this.ruleForm);
                }
                uni.setStorageSync('pingluenStateState', true);
                this.$utils.msgBack('提交成功');
            },
            getDate(type) {
                const date = new Date();
                let year = date.getFullYear();
                let month = date.getMonth() + 1;
                let day = date.getDate();
                if (type === 'start') {
                    year = year - 60;
                } else if (type === 'end') {
                    year = year + 2;
                }
                month = month > 9 ? month : '0' + month;;
                day = day > 9 ? day : '0' + day;
                return `${year}-${month}-${day}`;
            },
            toggleTab(str) {
                this.$refs[str].show();
            }
        }
    }
</script>
<style lang="scss" scoped>
    .container {
        padding: 20upx;
    }

    .content:after {
        position: fixed;
        top: 0;
        right: 0;
        left: 0;
        bottom: 0;
        content: '';
        background-attachment: fixed;
        background-size: cover;
        background-position: center;
    }

    textarea {
        border: 1upx solid #EEEEEE;
        border-radius: 20upx;
        padding: 20upx;
    }

    .title {
        width: 180upx;
    }

    .avator {
        width: 150upx;
        height: 60upx;
    }

    .right-input {
        flex: 1;
        text-align: left;
        padding: 0 24upx;
    }

    .cu-form-group.active {
        justify-content: space-between;
    }

    .cu-form-group .title {
        height: auto;
        line-height:30rpx
    }

    .btn {
        display: flex;
        align-items: center;
        justify-content: center;
        flex-wrap: wrap;
        padding: 20upx 0;
    }

    .cu-form-group {
        padding: 0 24upx;
        background-color: transparent;
        min-height: inherit;
    }

    .cu-form-group+.cu-form-group {
        border: 0;
    }

    .cu-form-group uni-input {
        padding: 0 30upx;
    }

    .uni-input {
        padding: 0 30upx;
    }

    .cu-form-group uni-textarea {
        padding: 30upx;
        margin: 0;
    }

    .cu-form-group uni-picker::after {
        line-height: 80rpx;
    }

    .select .uni-input {
        line-height: 80rpx;
    }

    .input .right-input {
        line-height: 88rpx;
    }
</style>