# Copyright (C) 2012-2017 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "FSL Community BSP Linux mainline based kernel with backported features and fixes"
DESCRIPTION = "Linux kernel based on mainline kernel used by FSL Community BSP in order to \
provide support for some backported features and fixes, or because it was applied in linux-next \
and takes some time to become part of a stable version, or because it is not applicable for \
upstreaming."

include linux-fslc.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=bbea815ee2795b2f4230826c0c6b8814"

PV = "4.18+git${SRCPV}"

SRCBRANCH = "4.18.x+fslc"
SRCREV = "9c4e93aa83ce1274279c54e557312d431ff91654"

COMPATIBLE_MACHINE = "(mxs|mx5|mx6|vf|use-mainline-bsp)"
