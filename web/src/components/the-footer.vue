<template>
    <a-layout-footer style="text-align: center">
        甲蛙电子书，欢迎：{{user.name}}
    </a-layout-footer>
</template>

<script lang="ts">
    import store from '@/store';
import { defineComponent, computed } from 'vue';

    export default defineComponent({
        name: 'the-footer',
        setup() {
            const user = computed(() => store.state.user);

            return {
                user
            }
        }
    });
</script>