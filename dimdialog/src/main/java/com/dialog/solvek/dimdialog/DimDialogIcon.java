package com.dialog.solvek.dimdialog;

public enum DimDialogIcon {
        ERROR(R.drawable.error_layout),
        SUCCESS(R.drawable.success_layout),
        INFO(R.drawable.info_layout),
        WARNING(R.drawable.warning_layout),
        QUESTION(R.drawable.question_layout);
        private int id;

        DimDialogIcon(int id) {
            this.id = id;
        }

        public int id() {
            return id;
        }
}
