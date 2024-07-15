import { createWebHistory, createRouter } from 'vue-router'
import HomeView from '../views/HomeView.vue';
import RecruitmentView from '../views/RecruitmentView.vue';
import PortfolioView from '../views/PortfolioView.vue';
import EducationView from '../views/EducationView.vue';
import ActivityView from '../views/ActivityView.vue';



const routes = [
    {
        path: '/',
        name: 'Home',
        component: HomeView
    },
    {
        path: '/recruitment',
        name: 'Recruit',
        component: RecruitmentView
    },
    {
        path: '/portfolio',
        name: 'Portfolio',
        component: PortfolioView
    },
    {
        path: '/education',
        name: 'Education',
        component: EducationView
    },
    {
        path: '/activity',
        name: 'Activity',
        component: ActivityView
    }
]

const router = createRouter({
    history: createWebHistory(),
    routes
})

export default router