package com.spring.boot.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 平台薪资项定义信息表
 * </p>
 *
 * @author rock
 * @since 2019-10-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PlatformSalaryItemDefinition implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 薪资项编码
     */
    private String itemCode;

    /**
     * 薪资项名称
     */
    private String itemName;

    /**
     * 薪资项变量
     */
    private String itemVariant;

    /**
     * 薪资项别名
     */
    private String itemAlias;

    /**
     * 薪资项类型：1-文本项；2-输入项；3-计算项
     */
    private Integer itemType;

    /**
     * 数据类型：1-文本；2-整数；3-小数
     */
    private Integer dataType;

    /**
     * 数据长度
     */
    private Integer dataLength;

    /**
     * 小数位数
     */
    private Integer decimalDigits;

    /**
     * 进位方式：1-四舍五入；2-简单去位
     */
    private Integer roundingMode;

    /**
     * 计算公式
     */
    private String computeExpression;

    /**
     * 显示顺序
     */
    private Integer displayOrder;

    /**
     * 计算顺序
     */
    private Integer computeOrder;

    /**
     * 薪资项分类：1-五险一金；2-专项附加扣除；3-本期税收项目；4-已累计税收项；5-累计税收项
     */
    private Integer itemCategory;

    /**
     * 报税计算薪资项分类：1-累计税收项；2-已累计税收项
     */
    private Integer taxDeclareComputeItemCategory;

    /**
     * 病事假扣款基数项类型：1-必选项；2-可选项
     */
    private Integer floatSalaryBaseItemType;

    /**
     * 病事假扣款基数项：1-是；0-否
     */
    private Integer floatSalaryBaseItem;

    /**
     * 加班费基数项类型：1-必选项；2-可选项
     */
    private Integer overtimeBaseItemType;

    /**
     * 加班费基数项：1-是；0-否
     */
    private Integer overtimeBaseItem;

    /**
     * 工资调整基数项类型：1-必选项；2-可选项
     */
    private Integer fixedAllowanceItemType;

    /**
     * 工资调整基数项：1-是；0-否
     */
    private Integer fixedAllowanceItem;

    /**
     * 导出导入计算数据项：1-是；0-否
     */
    private Integer isExportImportComputeItem;

    /**
     * 可编辑计算数据项：1-是；0-否
     */
    private Integer isEditableComputeItem;

    /**
     * 薪资录入项：1-是；0-否
     */
    private Integer isSalaryInputItem;

    /**
     * 薪资模板必选项：1-是；0-否
     */
    private Integer isMandatorySalaryTemplateItem;

    /**
     * 薪资模板项：1-是；0-否
     */
    private Integer isSalaryTemplateItem;

    /**
     * 初始化薪资模板项：1-必选项；2-可选项
     */
    private Integer initSalaryTemplateItem;

    /**
     * 薪资模板项分类：1 -基本报酬；2 -岗位工资；3 -绩效、奖金、补偿；4 -工资调整基数项；5 -病事假扣款基数项；6 -公司福利；7 -计算结果可选项；8 -法定福利；9 -其他税务申报项；10-专项附加扣除；11-税后所得；12-基本信息；13-已累计税收项
     */
    private Integer salaryTemplateItemCategory;

    /**
     * 应发应扣项：1-应发项；2-应扣项
     */
    private Integer payableDeductableItem;

    /**
     * 报税明细项：1-是；0-否
     */
    private Integer isTaxDeclareDetailItem;

    /**
     * 报税模板项：1-是；0-否
     */
    private Integer isTaxDeclareTemplateItem;

    /**
     * 备注 
     */
    private String remark;

    /**
     * 是否启用：1-启用；0-禁用
     */
    private Boolean isActive;

    /**
     * 创建人
     */
    private String createdBy;

    /**
     * 创建时间
     */
    private LocalDateTime createdTime;

    /**
     * 修改人
     */
    private String modifiedBy;

    /**
     * 修改时间
     */
    private LocalDateTime modifiedTime;

    /**
     * 版本号
     */
    private Integer version;


}
