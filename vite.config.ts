import { UserConfigFn } from 'vite';
import { overrideVaadinConfig } from './vite.generated';

const customConfig: UserConfigFn = (env) => ({
  build: {
    rollupOptions: {
      external: ['./web-component/spread-sheet.js'],
    },
  },
  // Here you can add custom Vite parameters
  // https://vitejs.dev/config/
});

export default overrideVaadinConfig(customConfig);
